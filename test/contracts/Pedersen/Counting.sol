// SPDX-License-Identifier: GPL-3.0-or-later
pragma solidity ^0.8.19;
contract Counting {
    mapping (uint256 => uint) public candidates;
    function _count (uint256 value) internal 
    {
        candidates[value] += 1;
    }
}