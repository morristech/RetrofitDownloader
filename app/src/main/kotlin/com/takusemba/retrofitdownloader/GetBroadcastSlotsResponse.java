// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/broadcast_slots.proto at 94:1
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

public final class GetBroadcastSlotsResponse extends Message<GetBroadcastSlotsResponse, GetBroadcastSlotsResponse.Builder> {
  public static final ProtoAdapter<GetBroadcastSlotsResponse> ADAPTER = new ProtoAdapter_GetBroadcastSlotsResponse();

  private static final long serialVersionUID = 0L;

  /**
   * / 放送中の放送枠情報
   */
  @WireField(
      tag = 1,
      adapter = "tv.abema.protos.BroadcastSlot#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<BroadcastSlot> slots;

  public GetBroadcastSlotsResponse(List<BroadcastSlot> slots) {
    this(slots, ByteString.EMPTY);
  }

  public GetBroadcastSlotsResponse(List<BroadcastSlot> slots, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.slots = Internal.immutableCopyOf("slots", slots);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.slots = Internal.copyOf("slots", slots);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetBroadcastSlotsResponse)) return false;
    GetBroadcastSlotsResponse o = (GetBroadcastSlotsResponse) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(slots, o.slots);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (slots != null ? slots.hashCode() : 1);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (slots != null) builder.append(", slots=").append(slots);
    return builder.replace(0, 2, "GetBroadcastSlotsResponse{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetBroadcastSlotsResponse, Builder> {
    public List<BroadcastSlot> slots;

    public Builder() {
      slots = Internal.newMutableList();
    }

    /**
     * / 放送中の放送枠情報
     */
    public Builder slots(List<BroadcastSlot> slots) {
      Internal.checkElementsNotNull(slots);
      this.slots = slots;
      return this;
    }

    @Override
    public GetBroadcastSlotsResponse build() {
      return new GetBroadcastSlotsResponse(slots, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetBroadcastSlotsResponse extends ProtoAdapter<GetBroadcastSlotsResponse> {
    ProtoAdapter_GetBroadcastSlotsResponse() {
      super(FieldEncoding.LENGTH_DELIMITED, GetBroadcastSlotsResponse.class);
    }

    @Override
    public int encodedSize(GetBroadcastSlotsResponse value) {
      return BroadcastSlot.ADAPTER.asRepeated().encodedSizeWithTag(1, value.slots)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetBroadcastSlotsResponse value) throws IOException {
      if (value.slots != null) BroadcastSlot.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.slots);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetBroadcastSlotsResponse decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.slots.add(BroadcastSlot.ADAPTER.decode(reader)); break;
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
    public GetBroadcastSlotsResponse redact(GetBroadcastSlotsResponse value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.slots, BroadcastSlot.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}