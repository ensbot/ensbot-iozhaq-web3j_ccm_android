package org.web3j.protocol.core.methods.response;

import org.web3j.protocol.core.Response;

/**
 * ccm_compileLLL.
 */
public class EthCompileLLL extends Response<String> {
    public String getCompiledSourceCode() {
        return getResult();
    }
}
