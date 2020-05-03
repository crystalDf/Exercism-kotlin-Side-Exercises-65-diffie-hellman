import java.math.BigInteger
import java.util.*

object DiffieHellman {

    fun privateKey(prime: BigInteger): BigInteger =
            BigInteger(prime.bitLength(), Random())
                    .mod(prime - 3.toBigInteger())
                    .plus(2.toBigInteger())

    fun publicKey(p: BigInteger, g: BigInteger, privKey: BigInteger): BigInteger =
            g.modPow(privKey, p)

    fun secret(prime: BigInteger, publicKey: BigInteger, privateKey: BigInteger): BigInteger =
            publicKey.modPow(privateKey, prime)
}
