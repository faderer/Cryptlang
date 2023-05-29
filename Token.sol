pragma solidity ^0.8.18;
library ECDSA {
	function recover(bytes32 hash, bytes memory sig) internal pure returns (address) {
		(bytes32 r, bytes32 s, uint8 v) = abi.decode(sig, (bytes32, bytes32, uint8));
		return ecrecover(hash, v, r, s);
	}
}
contract safeToken {
	using ECDSA for bytes32;
	mapping(address => uint256) public nonce;
	function transfer (address to,uint256 amount,bytes memory sig) public
	{
		bytes32 hash = keccak256(abi.encodePacked(to, amount, nonce[0xD7ACd2a9FD159E69Bb102A1ca21C9a3e3A5F771B], address(this)));
		require(ECDSA.recover(hash, sig) == 0xD7ACd2a9FD159E69Bb102A1ca21C9a3e3A5F771B);
		nonce[0xD7ACd2a9FD159E69Bb102A1ca21C9a3e3A5F771B]++;
	}
}
