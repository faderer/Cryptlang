// SPDX-License-Identifier: GPL-3.0-or-later
pragma solidity ^0.8.20;

import { IERC20 , SafeERC20 } from "@openzeppelin/contracts/token/ERC20/utils/SafeERC20.sol" ;

contract Distributor {
    using SafeERC20 for IERC20;
    address public token;
    // This is a packed array of booleans.
    mapping(uint256 => uint256) private claimedBitMap;

    function setToken(address token_) public {
        require(token == address(0), "Already set!");
        token = token_;
    }

    function isClaimed(uint256 index) public view returns (bool) {
        uint256 claimedWordIndex = index / 256;
        uint256 claimedBitIndex = index % 256;
        uint256 claimedWord = claimedBitMap[claimedWordIndex];
        uint256 mask = (1 << claimedBitIndex);
        return claimedWord & mask == mask;
    }

    function _setClaimed(uint256 index) internal {
        uint256 claimedWordIndex = index / 256;
        uint256 claimedBitIndex = index % 256;
        claimedBitMap[claimedWordIndex] = claimedBitMap[claimedWordIndex] | (1 << claimedBitIndex);
    }

    function transfer(address to, uint256 amount) public {
        IERC20(token).safeTransfer(to, amount);
    }
}