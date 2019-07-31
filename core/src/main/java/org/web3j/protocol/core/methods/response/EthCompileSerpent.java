package org.web3j.protocol.core.methods.response;

import org.web3j.protocol.core.Response;

/**
 * ccm_compileSerpent.
 */
public class EthCompileSerpent extends Response<String> {
    public String getCompiledSourceCode() {
        return getResult();
    }
}
