// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/user.proto at 129:1
package tv.abema.protos;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

/**
 * Represents a request of link facebook account
 */
public final class LinkFacebookRequest extends Message<LinkFacebookRequest, LinkFacebookRequest.Builder> {
  public static final ProtoAdapter<LinkFacebookRequest> ADAPTER = new ProtoAdapter_LinkFacebookRequest();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ACCESSTOKEN = "";

  public static final Boolean DEFAULT_OVERWRITE = false;

  /**
   * / Access token from Facebook
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String accessToken;

  /**
   * / Force overwriting
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean overwrite;

  public LinkFacebookRequest(String accessToken, Boolean overwrite) {
    this(accessToken, overwrite, ByteString.EMPTY);
  }

  public LinkFacebookRequest(String accessToken, Boolean overwrite, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.accessToken = accessToken;
    this.overwrite = overwrite;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.accessToken = accessToken;
    builder.overwrite = overwrite;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof LinkFacebookRequest)) return false;
    LinkFacebookRequest o = (LinkFacebookRequest) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(accessToken, o.accessToken)
        && Internal.equals(overwrite, o.overwrite);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (accessToken != null ? accessToken.hashCode() : 0);
      result = result * 37 + (overwrite != null ? overwrite.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (accessToken != null) builder.append(", accessToken=").append(accessToken);
    if (overwrite != null) builder.append(", overwrite=").append(overwrite);
    return builder.replace(0, 2, "LinkFacebookRequest{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<LinkFacebookRequest, Builder> {
    public String accessToken;

    public Boolean overwrite;

    public Builder() {
    }

    /**
     * / Access token from Facebook
     */
    public Builder accessToken(String accessToken) {
      this.accessToken = accessToken;
      return this;
    }

    /**
     * / Force overwriting
     */
    public Builder overwrite(Boolean overwrite) {
      this.overwrite = overwrite;
      return this;
    }

    @Override
    public LinkFacebookRequest build() {
      return new LinkFacebookRequest(accessToken, overwrite, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_LinkFacebookRequest extends ProtoAdapter<LinkFacebookRequest> {
    ProtoAdapter_LinkFacebookRequest() {
      super(FieldEncoding.LENGTH_DELIMITED, LinkFacebookRequest.class);
    }

    @Override
    public int encodedSize(LinkFacebookRequest value) {
      return (value.accessToken != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.accessToken) : 0)
          + (value.overwrite != null ? ProtoAdapter.BOOL.encodedSizeWithTag(2, value.overwrite) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, LinkFacebookRequest value) throws IOException {
      if (value.accessToken != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.accessToken);
      if (value.overwrite != null) ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.overwrite);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public LinkFacebookRequest decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.accessToken(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.overwrite(ProtoAdapter.BOOL.decode(reader)); break;
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
    public LinkFacebookRequest redact(LinkFacebookRequest value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
