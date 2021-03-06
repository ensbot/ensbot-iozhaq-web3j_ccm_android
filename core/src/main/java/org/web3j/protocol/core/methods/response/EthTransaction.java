package org.web3j.protocol.core.methods.response;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectReader;

import java8.util.Optional;

import org.web3j.protocol.ObjectMapperFactory;
import org.web3j.protocol.core.Response;

/**
 * Transaction object returned by:
 * <ul>
 * <li>ccm_getTransactionByHash</li>
 * <li>ccm_getTransactionByBlockHashAndIndex</li>
 * <li>ccm_getTransactionByBlockNumberAndIndex</li>
 * </ul>
 *
 * <p>This differs slightly from the request {@link EthSendTransaction} Transaction object.</p>
 *
 * <p>See
 * <a href="https://github.com/ethereum/wiki/wiki/JSON-RPC#ccm_gettransactionbyhash">docs</a>
 * for further details.</p>
 */
public class EthTransaction extends Response<Transaction> {

    public Optional<Transaction> getTransaction() {
        return Optional.ofNullable(getResult());
    }

    public static class ResponseDeserialiser extends JsonDeserializer<Transaction> {

        private ObjectReader objectReader = ObjectMapperFactory.getObjectReader();

        @Override
        public Transaction deserialize(
                JsonParser jsonParser,
                DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                return objectReader.readValue(jsonParser, Transaction.class);
            } else {
                return null;  // null is wrapped by Optional in above getter
            }
        }
    }
}
