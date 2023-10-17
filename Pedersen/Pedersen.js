var EC = require('elliptic').ec;
var ec = new EC('secp256k1');

function commitTo(H, r, x) {
    return ec.g.mul(r).add(H.mul(x));
}

module.exports = {
    commitTo,
}
