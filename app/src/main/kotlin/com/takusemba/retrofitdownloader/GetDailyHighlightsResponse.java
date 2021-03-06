// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/highlight.proto at 36:1
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
 * / 今日のみどころ情報取得Response
 */
public final class GetDailyHighlightsResponse extends Message<GetDailyHighlightsResponse, GetDailyHighlightsResponse.Builder> {
  public static final ProtoAdapter<GetDailyHighlightsResponse> ADAPTER = new ProtoAdapter_GetDailyHighlightsResponse();

  private static final long serialVersionUID = 0L;

  /**
   * / 今日の見どころ情報
   */
  @WireField(
      tag = 1,
      adapter = "tv.abema.protos.DailyHighlightSlot#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<DailyHighlightSlot> slots;

  /**
   * / みどころカテゴリ一覧
   */
  @WireField(
      tag = 2,
      adapter = "tv.abema.protos.HighlightCategory#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<HighlightCategory> categories;

  /**
   * / Data set
   */
  @WireField(
      tag = 10,
      adapter = "tv.abema.protos.DataSet#ADAPTER"
  )
  public final DataSet dataSet;

  public GetDailyHighlightsResponse(List<DailyHighlightSlot> slots, List<HighlightCategory> categories, DataSet dataSet) {
    this(slots, categories, dataSet, ByteString.EMPTY);
  }

  public GetDailyHighlightsResponse(List<DailyHighlightSlot> slots, List<HighlightCategory> categories, DataSet dataSet, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.slots = Internal.immutableCopyOf("slots", slots);
    this.categories = Internal.immutableCopyOf("categories", categories);
    this.dataSet = dataSet;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.slots = Internal.copyOf("slots", slots);
    builder.categories = Internal.copyOf("categories", categories);
    builder.dataSet = dataSet;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetDailyHighlightsResponse)) return false;
    GetDailyHighlightsResponse o = (GetDailyHighlightsResponse) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(slots, o.slots)
        && Internal.equals(categories, o.categories)
        && Internal.equals(dataSet, o.dataSet);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (slots != null ? slots.hashCode() : 1);
      result = result * 37 + (categories != null ? categories.hashCode() : 1);
      result = result * 37 + (dataSet != null ? dataSet.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (slots != null) builder.append(", slots=").append(slots);
    if (categories != null) builder.append(", categories=").append(categories);
    if (dataSet != null) builder.append(", dataSet=").append(dataSet);
    return builder.replace(0, 2, "GetDailyHighlightsResponse{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetDailyHighlightsResponse, Builder> {
    public List<DailyHighlightSlot> slots;

    public List<HighlightCategory> categories;

    public DataSet dataSet;

    public Builder() {
      slots = Internal.newMutableList();
      categories = Internal.newMutableList();
    }

    /**
     * / 今日の見どころ情報
     */
    public Builder slots(List<DailyHighlightSlot> slots) {
      Internal.checkElementsNotNull(slots);
      this.slots = slots;
      return this;
    }

    /**
     * / みどころカテゴリ一覧
     */
    public Builder categories(List<HighlightCategory> categories) {
      Internal.checkElementsNotNull(categories);
      this.categories = categories;
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
    public GetDailyHighlightsResponse build() {
      return new GetDailyHighlightsResponse(slots, categories, dataSet, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetDailyHighlightsResponse extends ProtoAdapter<GetDailyHighlightsResponse> {
    ProtoAdapter_GetDailyHighlightsResponse() {
      super(FieldEncoding.LENGTH_DELIMITED, GetDailyHighlightsResponse.class);
    }

    @Override
    public int encodedSize(GetDailyHighlightsResponse value) {
      return DailyHighlightSlot.ADAPTER.asRepeated().encodedSizeWithTag(1, value.slots)
          + HighlightCategory.ADAPTER.asRepeated().encodedSizeWithTag(2, value.categories)
          + (value.dataSet != null ? DataSet.ADAPTER.encodedSizeWithTag(10, value.dataSet) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetDailyHighlightsResponse value) throws IOException {
      if (value.slots != null) DailyHighlightSlot.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.slots);
      if (value.categories != null) HighlightCategory.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.categories);
      if (value.dataSet != null) DataSet.ADAPTER.encodeWithTag(writer, 10, value.dataSet);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetDailyHighlightsResponse decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.slots.add(DailyHighlightSlot.ADAPTER.decode(reader)); break;
          case 2: builder.categories.add(HighlightCategory.ADAPTER.decode(reader)); break;
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
    public GetDailyHighlightsResponse redact(GetDailyHighlightsResponse value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.slots, DailyHighlightSlot.ADAPTER);
      Internal.redactElements(builder.categories, HighlightCategory.ADAPTER);
      if (builder.dataSet != null) builder.dataSet = DataSet.ADAPTER.redact(builder.dataSet);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
