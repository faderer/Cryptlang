pragma solidity ^0.8.18;
contract Counting {
    mapping (uint256 => uint) public candidates;
    function _count (uint256 value) internal 
    {
        candidates[value] += 1;
    }
}