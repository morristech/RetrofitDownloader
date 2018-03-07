// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/media.proto at 311:1
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
 * Media version inclues the latest snapshot version.
 */
public final class MediaVersionResponse extends Message<MediaVersionResponse, MediaVersionResponse.Builder> {
  public static final ProtoAdapter<MediaVersionResponse> ADAPTER = new ProtoAdapter_MediaVersionResponse();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_VERSION = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String version;

  public MediaVersionResponse(String version) {
    this(version, ByteString.EMPTY);
  }

  public MediaVersionResponse(String version, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.version = version;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.version = version;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof MediaVersionResponse)) return false;
    MediaVersionResponse o = (MediaVersionResponse) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(version, o.version);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (version != null ? version.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (version != null) builder.append(", version=").append(version);
    return builder.replace(0, 2, "MediaVersionResponse{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<MediaVersionResponse, Builder> {
    public String version;

    public Builder() {
    }

    public Builder version(String version) {
      this.version = version;
      return this;
    }

    @Override
    public MediaVersionResponse build() {
      return new MediaVersionResponse(version, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_MediaVersionResponse extends ProtoAdapter<MediaVersionResponse> {
    ProtoAdapter_MediaVersionResponse() {
      super(FieldEncoding.LENGTH_DELIMITED, MediaVersionResponse.class);
    }

    @Override
    public int encodedSize(MediaVersionResponse value) {
      return (value.version != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.version) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, MediaVersionResponse value) throws IOException {
      if (value.version != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.version);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public MediaVersionResponse decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.version(ProtoAdapter.STRING.decode(reader)); break;
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
    public MediaVersionResponse redact(MediaVersionResponse value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
