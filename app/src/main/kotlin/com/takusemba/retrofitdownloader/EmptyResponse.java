// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/empty.proto at 10:1
package tv.abema.protos;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

public final class EmptyResponse extends Message<EmptyResponse, EmptyResponse.Builder> {
  public static final ProtoAdapter<EmptyResponse> ADAPTER = new ProtoAdapter_EmptyResponse();

  private static final long serialVersionUID = 0L;

  public EmptyResponse() {
    this(ByteString.EMPTY);
  }

  public EmptyResponse(ByteString unknownFields) {
    super(ADAPTER, unknownFields);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    return other instanceof EmptyResponse;
  }

  @Override
  public int hashCode() {
    return unknownFields().hashCode();
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    return builder.replace(0, 2, "EmptyResponse{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<EmptyResponse, Builder> {
    public Builder() {
    }

    @Override
    public EmptyResponse build() {
      return new EmptyResponse(buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_EmptyResponse extends ProtoAdapter<EmptyResponse> {
    ProtoAdapter_EmptyResponse() {
      super(FieldEncoding.LENGTH_DELIMITED, EmptyResponse.class);
    }

    @Override
    public int encodedSize(EmptyResponse value) {
      return value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, EmptyResponse value) throws IOException {
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public EmptyResponse decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
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
    public EmptyResponse redact(EmptyResponse value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
