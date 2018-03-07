// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/search.proto at 13:1
package tv.abema.protos;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import okio.ByteString;

/**
 * / SlotSearchResponse represents a response of getting search result of slots.
 */
public final class SlotSearchResponse extends Message<SlotSearchResponse, SlotSearchResponse.Builder> {
  public static final ProtoAdapter<SlotSearchResponse> ADAPTER = new ProtoAdapter_SlotSearchResponse();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_COUNT = 0L;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REPEATED
  )
  public final List<String> slotIds;

  /**
   * / Total count
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long count;

  /**
   * / Data set.
   */
  @WireField(
      tag = 10,
      adapter = "tv.abema.protos.DataSet#ADAPTER"
  )
  public final DataSet dataSet;

  public SlotSearchResponse(List<String> slotIds, Long count, DataSet dataSet) {
    this(slotIds, count, dataSet, ByteString.EMPTY);
  }

  public SlotSearchResponse(List<String> slotIds, Long count, DataSet dataSet, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.slotIds = Internal.immutableCopyOf("slotIds", slotIds);
    this.count = count;
    this.dataSet = dataSet;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.slotIds = Internal.copyOf("slotIds", slotIds);
    builder.count = count;
    builder.dataSet = dataSet;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof SlotSearchResponse)) return false;
    SlotSearchResponse o = (SlotSearchResponse) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(slotIds, o.slotIds)
        && Internal.equals(count, o.count)
        && Internal.equals(dataSet, o.dataSet);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (slotIds != null ? slotIds.hashCode() : 1);
      result = result * 37 + (count != null ? count.hashCode() : 0);
      result = result * 37 + (dataSet != null ? dataSet.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (slotIds != null) builder.append(", slotIds=").append(slotIds);
    if (count != null) builder.append(", count=").append(count);
    if (dataSet != null) builder.append(", dataSet=").append(dataSet);
    return builder.replace(0, 2, "SlotSearchResponse{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<SlotSearchResponse, Builder> {
    public List<String> slotIds;

    public Long count;

    public DataSet dataSet;

    public Builder() {
      slotIds = Internal.newMutableList();
    }

    public Builder slotIds(List<String> slotIds) {
      Internal.checkElementsNotNull(slotIds);
      this.slotIds = slotIds;
      return this;
    }

    /**
     * / Total count
     */
    public Builder count(Long count) {
      this.count = count;
      return this;
    }

    /**
     * / Data set.
     */
    public Builder dataSet(DataSet dataSet) {
      this.dataSet = dataSet;
      return this;
    }

    @Override
    public SlotSearchResponse build() {
      return new SlotSearchResponse(slotIds, count, dataSet, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_SlotSearchResponse extends ProtoAdapter<SlotSearchResponse> {
    ProtoAdapter_SlotSearchResponse() {
      super(FieldEncoding.LENGTH_DELIMITED, SlotSearchResponse.class);
    }

    @Override
    public int encodedSize(SlotSearchResponse value) {
      return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, value.slotIds)
          + (value.count != null ? ProtoAdapter.INT64.encodedSizeWithTag(2, value.count) : 0)
          + (value.dataSet != null ? DataSet.ADAPTER.encodedSizeWithTag(10, value.dataSet) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, SlotSearchResponse value) throws IOException {
      if (value.slotIds != null) ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, value.slotIds);
      if (value.count != null) ProtoAdapter.INT64.encodeWithTag(writer, 2, value.count);
      if (value.dataSet != null) DataSet.ADAPTER.encodeWithTag(writer, 10, value.dataSet);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public SlotSearchResponse decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.slotIds.add(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.count(ProtoAdapter.INT64.decode(reader)); break;
          case 10: builder.dataSet(DataSet.ADAPTER.decode(reader)); break;
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
    public SlotSearchResponse redact(SlotSearchResponse value) {
      Builder builder = value.newBuilder();
      if (builder.dataSet != null) builder.dataSet = DataSet.ADAPTER.redact(builder.dataSet);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
