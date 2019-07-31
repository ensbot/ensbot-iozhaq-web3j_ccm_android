package org.web3j.protocol.core.methods.response;

import org.web3j.protocol.core.Response;

/**
 * ccm_sendRawTransaction.
 */
public class EthSendRawTransaction extends Response<String> {
    public String getTransactionHash() {
        return getResult();
    }
}
