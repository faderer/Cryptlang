pragma solidity ^0.8.18;
import { BLS } from "./BLS.sol";

library BLSOpen {
    function verifySingle(
        uint256[2] memory signature,
        uint256[4] memory pubkey,
        uint256[2] memory message
    ) external view returns (bool) {
        uint256[4][] memory pubkeys = new uint256[4][](1);
        uint256[2][] memory messages = new uint256[2][](1);
        pubkeys[0] = pubkey;
        messages[0] = message;

        (bool verified, bool callSuccess) =  BLS.verifyMultiple(
            signature,
            pubkeys,
            messages
        );
        return callSuccess && verified;
    }

    function verifyMultiple(
        uint256[2] memory signature,
        uint256[4][] memory pubkeys,
        uint256[2][] memory messages
    ) external view returns (bool) {
        (bool verified, bool callSuccess) =  BLS.verifyMultiple(
            signature,
            pubkeys,
            messages
        );
        return callSuccess && verified;
    }

    function hashToPoint(
        bytes memory message
    ) external view returns (uint256[2] memory) {
        return BLS.hashToPoint(
            bytes32(BLS.N),
            message
        );
    }

}
contract safeToken {
	using BLSOpen for *;
	mapping(address => uint256) public nonce;
	mapping (address => uint256[4]) public pubkey;
	function transfer (address _to,uint256 _amount,uint256[2] memory sig) public
	{
		bytes memory hash = abi.encodePacked(sha256(abi.encodePacked(_to, _amount, nonce[0xD7ACd2a9FD159E69Bb102A1ca21C9a3e3A5F771B], address(this))));
		uint256[2] memory message = BLSOpen.hashToPoint(hash);
		require(BLSOpen.verifySingle(sig, pubkey[0xD7ACd2a9FD159E69Bb102A1ca21C9a3e3A5F771B], message));
		nonce[0xD7ACd2a9FD159E69Bb102A1ca21C9a3e3A5F771B]++;
	}
}
