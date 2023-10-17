pragma circom 2.0.0;

template Factor() {
    signal input a;
    signal input b;
    signal output n;
    n <== a*b;
 }

 component main = Factor();