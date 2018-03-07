// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/video.proto at 178:1
package tv.abema.protos;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

/**
 * / 視聴ポイント
 */
public final class ProgramViewingPoint extends Message<ProgramViewingPoint, ProgramViewingPoint.Builder> {
  public static final ProtoAdapter<ProgramViewingPoint> ADAPTER = new ProtoAdapter_ProgramViewingPoint();

  private static final long serialVersionUID = 0L;

  public static final Double DEFAULT_SUGGESTION = 0.0d;

  /**
   * 続きサジェストポイント（s）
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#DOUBLE"
  )
  public final Double suggestion;

  public ProgramViewingPoint(Double suggestion) {
    this(suggestion, ByteString.EMPTY);
  }

  public ProgramViewingPoint(Double suggestion, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.suggestion = suggestion;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.suggestion = suggestion;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ProgramViewingPoint)) return false;
    ProgramViewingPoint o = (ProgramViewingPoint) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(suggestion, o.suggestion);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (suggestion != null ? suggestion.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (suggestion != null) builder.append(", suggestion=").append(suggestion);
    return builder.replace(0, 2, "ProgramViewingPoint{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<ProgramViewingPoint, Builder> {
    public Double suggestion;

    public Builder() {
    }

    /**
     * 続きサジェストポイント（s）
     */
    public Builder suggestion(Double suggestion) {
      this.suggestion = suggestion;
      return this;
    }

    @Override
    public ProgramViewingPoint build() {
      return new ProgramViewingPoint(suggestion, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_ProgramViewingPoint extends ProtoAdapter<ProgramViewingPoint> {
    ProtoAdapter_ProgramViewingPoint() {
      super(FieldEncoding.LENGTH_DELIMITED, ProgramViewingPoint.class);
    }

    @Override
    public int encodedSize(ProgramViewingPoint value) {
      return (value.suggestion != null ? ProtoAdapter.DOUBLE.encodedSizeWithTag(1, value.suggestion) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, ProgramViewingPoint value) throws IOException {
      if (value.suggestion != null) ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, value.suggestion);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public ProgramViewingPoint decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.suggestion(ProtoAdapter.DOUBLE.decode(reader)); break;
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
    public ProgramViewingPoint redact(ProgramViewingPoint value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
