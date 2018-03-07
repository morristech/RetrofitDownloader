// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/share.proto at 60:1
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
 * / Represents a response of get shared statuses about the broadcast slot
 */
public final class GetSlotShareResponse extends Message<GetSlotShareResponse, GetSlotShareResponse.Builder> {
  public static final ProtoAdapter<GetSlotShareResponse> ADAPTER = new ProtoAdapter_GetSlotShareResponse();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_COUNT = 0L;

  /**
   * / Shared statuses about the broadcast slot
   */
  @WireField(
      tag = 1,
      adapter = "tv.abema.protos.SlotShareItem#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<SlotShareItem> share;

  /**
   * / Shared count
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long count;

  public GetSlotShareResponse(List<SlotShareItem> share, Long count) {
    this(share, count, ByteString.EMPTY);
  }

  public GetSlotShareResponse(List<SlotShareItem> share, Long count, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.share = Internal.immutableCopyOf("share", share);
    this.count = count;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.share = Internal.copyOf("share", share);
    builder.count = count;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetSlotShareResponse)) return false;
    GetSlotShareResponse o = (GetSlotShareResponse) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(share, o.share)
        && Internal.equals(count, o.count);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (share != null ? share.hashCode() : 1);
      result = result * 37 + (count != null ? count.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (share != null) builder.append(", share=").append(share);
    if (count != null) builder.append(", count=").append(count);
    return builder.replace(0, 2, "GetSlotShareResponse{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetSlotShareResponse, Builder> {
    public List<SlotShareItem> share;

    public Long count;

    public Builder() {
      share = Internal.newMutableList();
    }

    /**
     * / Shared statuses about the broadcast slot
     */
    public Builder share(List<SlotShareItem> share) {
      Internal.checkElementsNotNull(share);
      this.share = share;
      return this;
    }

    /**
     * / Shared count
     */
    public Builder count(Long count) {
      this.count = count;
      return this;
    }

    @Override
    public GetSlotShareResponse build() {
      return new GetSlotShareResponse(share, count, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetSlotShareResponse extends ProtoAdapter<GetSlotShareResponse> {
    ProtoAdapter_GetSlotShareResponse() {
      super(FieldEncoding.LENGTH_DELIMITED, GetSlotShareResponse.class);
    }

    @Override
    public int encodedSize(GetSlotShareResponse value) {
      return SlotShareItem.ADAPTER.asRepeated().encodedSizeWithTag(1, value.share)
          + (value.count != null ? ProtoAdapter.INT64.encodedSizeWithTag(2, value.count) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetSlotShareResponse value) throws IOException {
      if (value.share != null) SlotShareItem.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.share);
      if (value.count != null) ProtoAdapter.INT64.encodeWithTag(writer, 2, value.count);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetSlotShareResponse decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.share.add(SlotShareItem.ADAPTER.decode(reader)); break;
          case 2: builder.count(ProtoAdapter.INT64.decode(reader)); break;
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
    public GetSlotShareResponse redact(GetSlotShareResponse value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.share, SlotShareItem.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
