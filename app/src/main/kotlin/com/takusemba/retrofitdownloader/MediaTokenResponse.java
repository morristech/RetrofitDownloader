// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/media.proto at 290:1
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
 * Represents a token strings to play video.
 */
public final class MediaTokenResponse extends Message<MediaTokenResponse, MediaTokenResponse.Builder> {
  public static final ProtoAdapter<MediaTokenResponse> ADAPTER = new ProtoAdapter_MediaTokenResponse();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_TOKEN = "";

  /**
   * / 再生トークン
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String token;

  public MediaTokenResponse(String token) {
    this(token, ByteString.EMPTY);
  }

  public MediaTokenResponse(String token, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.token = token;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.token = token;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof MediaTokenResponse)) return false;
    MediaTokenResponse o = (MediaTokenResponse) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(token, o.token);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (token != null ? token.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (token != null) builder.append(", token=").append(token);
    return builder.replace(0, 2, "MediaTokenResponse{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<MediaTokenResponse, Builder> {
    public String token;

    public Builder() {
    }

    /**
     * / 再生トークン
     */
    public Builder token(String token) {
      this.token = token;
      return this;
    }

    @Override
    public MediaTokenResponse build() {
      return new MediaTokenResponse(token, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_MediaTokenResponse extends ProtoAdapter<MediaTokenResponse> {
    ProtoAdapter_MediaTokenResponse() {
      super(FieldEncoding.LENGTH_DELIMITED, MediaTokenResponse.class);
    }

    @Override
    public int encodedSize(MediaTokenResponse value) {
      return (value.token != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.token) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, MediaTokenResponse value) throws IOException {
      if (value.token != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.token);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public MediaTokenResponse decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.token(ProtoAdapter.STRING.decode(reader)); break;
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
    public MediaTokenResponse redact(MediaTokenResponse value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
