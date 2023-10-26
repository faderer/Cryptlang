// SPDX-License-Identifier: GPL-3.0-or-later
pragma solidity ^0.8.20;
import { ERC20 } from "./ERC20.sol" ;
import { ECDSA } from "@openzeppelin/contracts/utils/cryptography/ECDSA.sol" ;

contract ERC20Permit is ERC20 {
	using ECDSA for bytes32;
	mapping(address => uint256) public nonces;
    bytes32 public constant TYPEHASH = keccak256("Permit(address owner,address spender,uint256 value,uint256 nonce,uint256 deadline)");
	bytes32 public DOMAIN_SEPARATOR = keccak256(abi.encode(keccak256("EIP712Domain(uint256 chainId,address verifyingContract)"),block.chainid,address(this)));
    function permit (address _owner,address _spender,uint256 _value,uint256 deadline,uint8 v,bytes32 r,bytes32 s) public
	{
		require(deadline>=block.timestamp,"Expired deadline!");
        bytes32 hash = keccak256(abi.encodePacked('\x19\x01',DOMAIN_SEPARATOR,keccak256(abi.encodePacked(TYPEHASH, _owner, _spender, _value, nonces[_owner]++, deadline))));
		require(ECDSA.recover(hash, v, r, s) != address(0) && ECDSA.recover(hash, v, r, s) == _owner, "Invalid Signature!");
		_approve(_owner,_spender,_value);
	}
}
