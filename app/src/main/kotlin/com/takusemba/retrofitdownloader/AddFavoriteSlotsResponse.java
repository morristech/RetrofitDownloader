// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/favorite.proto at 36:1
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
 * / AddFavoriteSlotsResponse represents a response of adding a favorite slot.
 */
public final class AddFavoriteSlotsResponse extends Message<AddFavoriteSlotsResponse, AddFavoriteSlotsResponse.Builder> {
  public static final ProtoAdapter<AddFavoriteSlotsResponse> ADAPTER = new ProtoAdapter_AddFavoriteSlotsResponse();

  private static final long serialVersionUID = 0L;

  /**
   * / Added slots.
   */
  @WireField(
      tag = 1,
      adapter = "tv.abema.protos.FavoriteSlot#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<FavoriteSlot> slots;

  /**
   * / Data set
   */
  @WireField(
      tag = 10,
      adapter = "tv.abema.protos.DataSet#ADAPTER"
  )
  public final DataSet dataSet;

  public AddFavoriteSlotsResponse(List<FavoriteSlot> slots, DataSet dataSet) {
    this(slots, dataSet, ByteString.EMPTY);
  }

  public AddFavoriteSlotsResponse(List<FavoriteSlot> slots, DataSet dataSet, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.slots = Internal.immutableCopyOf("slots", slots);
    this.dataSet = dataSet;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.slots = Internal.copyOf("slots", slots);
    builder.dataSet = dataSet;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof AddFavoriteSlotsResponse)) return false;
    AddFavoriteSlotsResponse o = (AddFavoriteSlotsResponse) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(slots, o.slots)
        && Internal.equals(dataSet, o.dataSet);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (slots != null ? slots.hashCode() : 1);
      result = result * 37 + (dataSet != null ? dataSet.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (slots != null) builder.append(", slots=").append(slots);
    if (dataSet != null) builder.append(", dataSet=").append(dataSet);
    return builder.replace(0, 2, "AddFavoriteSlotsResponse{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<AddFavoriteSlotsResponse, Builder> {
    public List<FavoriteSlot> slots;

    public DataSet dataSet;

    public Builder() {
      slots = Internal.newMutableList();
    }

    /**
     * / Added slots.
     */
    public Builder slots(List<FavoriteSlot> slots) {
      Internal.checkElementsNotNull(slots);
      this.slots = slots;
      return this;
    }

    /**
     * / Data set
     */
    public Builder dataSet(DataSet dataSet) {
      this.dataSet = dataSet;
      return this;
    }

    @Override
    public AddFavoriteSlotsResponse build() {
      return new AddFavoriteSlotsResponse(slots, dataSet, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_AddFavoriteSlotsResponse extends ProtoAdapter<AddFavoriteSlotsResponse> {
    ProtoAdapter_AddFavoriteSlotsResponse() {
      super(FieldEncoding.LENGTH_DELIMITED, AddFavoriteSlotsResponse.class);
    }

    @Override
    public int encodedSize(AddFavoriteSlotsResponse value) {
      return FavoriteSlot.ADAPTER.asRepeated().encodedSizeWithTag(1, value.slots)
          + (value.dataSet != null ? DataSet.ADAPTER.encodedSizeWithTag(10, value.dataSet) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, AddFavoriteSlotsResponse value) throws IOException {
      if (value.slots != null) FavoriteSlot.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.slots);
      if (value.dataSet != null) DataSet.ADAPTER.encodeWithTag(writer, 10, value.dataSet);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public AddFavoriteSlotsResponse decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.slots.add(FavoriteSlot.ADAPTER.decode(reader)); break;
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
    public AddFavoriteSlotsResponse redact(AddFavoriteSlotsResponse value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.slots, FavoriteSlot.ADAPTER);
      if (builder.dataSet != null) builder.dataSet = DataSet.ADAPTER.redact(builder.dataSet);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
