pragma solidity ^0.8.18;
contract Vote {
    mapping (bytes32 => uint) number;
    function _count (bytes32 _leaf) public 
    {
        number[_leaf] += 1;
    }
}