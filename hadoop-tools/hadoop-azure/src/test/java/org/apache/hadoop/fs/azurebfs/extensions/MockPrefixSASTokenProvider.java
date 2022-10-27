package org.apache.hadoop.fs.azurebfs.extensions;

import org.apache.hadoop.security.AccessControlException;

import java.io.IOException;

public class MockPrefixSASTokenProvider extends  MockSASTokenProvider {

    @Override
    public String getSASToken(String accountName, String fileSystem, String path,
                              String operation) throws IOException {
        String token = super.getSASToken(accountName, fileSystem, path, operation);
        return "?"+token;
    }
}
