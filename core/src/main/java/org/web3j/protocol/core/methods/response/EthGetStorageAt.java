package org.web3j.protocol.core.methods.response;

import org.web3j.protocol.core.Response;

/**
 * ccm_getStorageAt.
 */
public class EthGetStorageAt extends Response<String> {
    public String getData() {
        return getResult();
    }
}
