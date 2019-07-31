package org.web3j.protocol.core.methods.response;

import org.web3j.protocol.core.Response;

/**
 * ccm_submitWork.
 */
public class EthSubmitWork extends Response<Boolean> {

    public boolean solutionValid() {
        return getResult();
    }
}
