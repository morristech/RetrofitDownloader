// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/user.proto at 216:1
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
 * / ワンタイムパスワードによる認証 request
 */
public final class AuthorizeByOneTimePasswordRequest extends Message<AuthorizeByOneTimePasswordRequest, AuthorizeByOneTimePasswordRequest.Builder> {
  public static final ProtoAdapter<AuthorizeByOneTimePasswordRequest> ADAPTER = new ProtoAdapter_AuthorizeByOneTimePasswordRequest();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_USERID = "";

  public static final String DEFAULT_PASSWORD = "";

  /**
   * / ユーザーID
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String userId;

  /**
   * / ワンタイムパスワード
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String password;

  public AuthorizeByOneTimePasswordRequest(String userId, String password) {
    this(userId, password, ByteString.EMPTY);
  }

  public AuthorizeByOneTimePasswordRequest(String userId, String password, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.userId = userId;
    this.password = password;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.userId = userId;
    builder.password = password;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof AuthorizeByOneTimePasswordRequest)) return false;
    AuthorizeByOneTimePasswordRequest o = (AuthorizeByOneTimePasswordRequest) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(userId, o.userId)
        && Internal.equals(password, o.password);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (userId != null ? userId.hashCode() : 0);
      result = result * 37 + (password != null ? password.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (userId != null) builder.append(", userId=").append(userId);
    if (password != null) builder.append(", password=").append(password);
    return builder.replace(0, 2, "AuthorizeByOneTimePasswordRequest{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<AuthorizeByOneTimePasswordRequest, Builder> {
    public String userId;

    public String password;

    public Builder() {
    }

    /**
     * / ユーザーID
     */
    public Builder userId(String userId) {
      this.userId = userId;
      return this;
    }

    /**
     * / ワンタイムパスワード
     */
    public Builder password(String password) {
      this.password = password;
      return this;
    }

    @Override
    public AuthorizeByOneTimePasswordRequest build() {
      return new AuthorizeByOneTimePasswordRequest(userId, password, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_AuthorizeByOneTimePasswordRequest extends ProtoAdapter<AuthorizeByOneTimePasswordRequest> {
    ProtoAdapter_AuthorizeByOneTimePasswordRequest() {
      super(FieldEncoding.LENGTH_DELIMITED, AuthorizeByOneTimePasswordRequest.class);
    }

    @Override
    public int encodedSize(AuthorizeByOneTimePasswordRequest value) {
      return (value.userId != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.userId) : 0)
          + (value.password != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.password) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, AuthorizeByOneTimePasswordRequest value) throws IOException {
      if (value.userId != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.userId);
      if (value.password != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.password);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public AuthorizeByOneTimePasswordRequest decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.userId(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.password(ProtoAdapter.STRING.decode(reader)); break;
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
    public AuthorizeByOneTimePasswordRequest redact(AuthorizeByOneTimePasswordRequest value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
