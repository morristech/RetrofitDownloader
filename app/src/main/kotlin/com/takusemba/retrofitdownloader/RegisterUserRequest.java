// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/user.proto at 104:1
package tv.abema.protos;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

/**
 * Represents a request of register user
 */
public final class RegisterUserRequest extends Message<RegisterUserRequest, RegisterUserRequest.Builder> {
  public static final ProtoAdapter<RegisterUserRequest> ADAPTER = new ProtoAdapter_RegisterUserRequest();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_DEVICEID = "";

  public static final String DEFAULT_APPLICATIONKEYSECRET = "";

  /**
   * / Generated device id
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String deviceId;

  /**
   * / Application key (secret)
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String applicationKeySecret;

  public RegisterUserRequest(String deviceId, String applicationKeySecret) {
    this(deviceId, applicationKeySecret, ByteString.EMPTY);
  }

  public RegisterUserRequest(String deviceId, String applicationKeySecret, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.deviceId = deviceId;
    this.applicationKeySecret = applicationKeySecret;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.deviceId = deviceId;
    builder.applicationKeySecret = applicationKeySecret;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof RegisterUserRequest)) return false;
    RegisterUserRequest o = (RegisterUserRequest) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(deviceId, o.deviceId)
        && Internal.equals(applicationKeySecret, o.applicationKeySecret);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (deviceId != null ? deviceId.hashCode() : 0);
      result = result * 37 + (applicationKeySecret != null ? applicationKeySecret.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (deviceId != null) builder.append(", deviceId=").append(deviceId);
    if (applicationKeySecret != null) builder.append(", applicationKeySecret=").append(applicationKeySecret);
    return builder.replace(0, 2, "RegisterUserRequest{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<RegisterUserRequest, Builder> {
    public String deviceId;

    public String applicationKeySecret;

    public Builder() {
    }

    /**
     * / Generated device id
     */
    public Builder deviceId(String deviceId) {
      this.deviceId = deviceId;
      return this;
    }

    /**
     * / Application key (secret)
     */
    public Builder applicationKeySecret(String applicationKeySecret) {
      this.applicationKeySecret = applicationKeySecret;
      return this;
    }

    @Override
    public RegisterUserRequest build() {
      return new RegisterUserRequest(deviceId, applicationKeySecret, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_RegisterUserRequest extends ProtoAdapter<RegisterUserRequest> {
    ProtoAdapter_RegisterUserRequest() {
      super(FieldEncoding.LENGTH_DELIMITED, RegisterUserRequest.class);
    }

    @Override
    public int encodedSize(RegisterUserRequest value) {
      return (value.deviceId != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.deviceId) : 0)
          + (value.applicationKeySecret != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.applicationKeySecret) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, RegisterUserRequest value) throws IOException {
      if (value.deviceId != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.deviceId);
      if (value.applicationKeySecret != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.applicationKeySecret);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public RegisterUserRequest decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.deviceId(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.applicationKeySecret(ProtoAdapter.STRING.decode(reader)); break;
          default: {
            FieldEncoding fieldEncoding = reader.peekFieldEncoding();
            Object value = fieldEncoding.rawProtoAdapter().decode(reader);
            builder.addUnknownField(tag, fieldEncoding, value);
          }
        }
      }
      reader.endMessage(token);
      return builder.build();
    }

    @Override
    public RegisterUserRequest redact(RegisterUserRequest value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
