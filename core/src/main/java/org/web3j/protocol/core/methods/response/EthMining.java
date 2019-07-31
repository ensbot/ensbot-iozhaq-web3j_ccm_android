package org.web3j.protocol.core.methods.response;

import org.web3j.protocol.core.Response;

/**
 * ccm_mining.
 */
public class EthMining extends Response<Boolean> {
    public boolean isMining() {
        return getResult();
    }
}
