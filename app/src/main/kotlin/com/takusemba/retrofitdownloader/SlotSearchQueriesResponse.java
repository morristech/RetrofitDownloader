// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/search.proto at 20:1
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
import java.util.List;
import okio.ByteString;

/**
 * / SlotSearchQueriesResponse represents a response of getting search queries of slots.
 */
public final class SlotSearchQueriesResponse extends Message<SlotSearchQueriesResponse, SlotSearchQueriesResponse.Builder> {
  public static final ProtoAdapter<SlotSearchQueriesResponse> ADAPTER = new ProtoAdapter_SlotSearchQueriesResponse();

  private static final long serialVersionUID = 0L;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REPEATED
  )
  public final List<String> queries;

  public SlotSearchQueriesResponse(List<String> queries) {
    this(queries, ByteString.EMPTY);
  }

  public SlotSearchQueriesResponse(List<String> queries, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.queries = Internal.immutableCopyOf("queries", queries);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.queries = Internal.copyOf("queries", queries);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof SlotSearchQueriesResponse)) return false;
    SlotSearchQueriesResponse o = (SlotSearchQueriesResponse) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(queries, o.queries);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (queries != null ? queries.hashCode() : 1);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (queries != null) builder.append(", queries=").append(queries);
    return builder.replace(0, 2, "SlotSearchQueriesResponse{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<SlotSearchQueriesResponse, Builder> {
    public List<String> queries;

    public Builder() {
      queries = Internal.newMutableList();
    }

    public Builder queries(List<String> queries) {
      Internal.checkElementsNotNull(queries);
      this.queries = queries;
      return this;
    }

    @Override
    public SlotSearchQueriesResponse build() {
      return new SlotSearchQueriesResponse(queries, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_SlotSearchQueriesResponse extends ProtoAdapter<SlotSearchQueriesResponse> {
    ProtoAdapter_SlotSearchQueriesResponse() {
      super(FieldEncoding.LENGTH_DELIMITED, SlotSearchQueriesResponse.class);
    }

    @Override
    public int encodedSize(SlotSearchQueriesResponse value) {
      return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, value.queries)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, SlotSearchQueriesResponse value) throws IOException {
      if (value.queries != null) ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, value.queries);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public SlotSearchQueriesResponse decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.queries.add(ProtoAdapter.STRING.decode(reader)); break;
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
    public SlotSearchQueriesResponse redact(SlotSearchQueriesResponse value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
