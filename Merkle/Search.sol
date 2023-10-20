pragma solidity ^0.8.18;
contract Search {
    mapping (bytes32 => uint) number;
    function _search (bytes32 _leaf) public 
    {
        number[_leaf] += 1;
    }
}