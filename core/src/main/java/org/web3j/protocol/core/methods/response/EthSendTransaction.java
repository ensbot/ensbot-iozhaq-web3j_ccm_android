package org.web3j.protocol.core.methods.response;

import org.web3j.protocol.core.Response;

/**
 * ccm_sendTransaction.
 */
public class EthSendTransaction extends Response<String> {
    public String getTransactionHash() {
        return getResult();
    }
}
