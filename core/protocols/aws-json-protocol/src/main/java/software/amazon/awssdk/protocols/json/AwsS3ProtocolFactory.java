/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package software.amazon.awssdk.protocols.json;

import software.amazon.awssdk.annotations.SdkProtectedApi;
import software.amazon.awssdk.core.http.HttpResponseHandler;

/**
 * Factory to generate the various protocol handlers and generators to be used for communicating with
 * Amazon S3. S3 has some unique differences from typical REST/XML that warrant a custom protocol factory.
 */
@SdkProtectedApi
public final class AwsS3ProtocolFactory extends BaseAwsJsonProtocolFactory {
    private AwsS3ProtocolFactory(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for {@link AwsS3ProtocolFactory}.
     */
    public static final class Builder extends BaseAwsJsonProtocolFactory.Builder<Builder> {

        private Builder() {
        }

        public AwsS3ProtocolFactory build() {
            return new AwsS3ProtocolFactory(this);
        }
    }
}
