// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/highlight.proto at 12:1
package tv.abema.protos;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

/**
 * / 今日のみどころ枠情報
 */
public final class DailyHighlightSlot extends Message<DailyHighlightSlot, DailyHighlightSlot.Builder> {
  public static final ProtoAdapter<DailyHighlightSlot> ADAPTER = new ProtoAdapter_DailyHighlightSlot();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_DATE = "";

  public static final String DEFAULT_SLOTID = "";

  public static final String DEFAULT_TITLE = "";

  public static final DisplaySize DEFAULT_DISPLAYSIZE = DisplaySize.NORMAL;

  public static final String DEFAULT_HIGHLIGHTCATEGORYID = "";

  public static final String DEFAULT_IMAGE = "";

  public static final Integer DEFAULT_ORDER = 0;

  /**
   * / 日付(yyyyMMdd)
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String date;

  /**
   * / 枠ID
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String slotId;

  /**
   * / 見どころタイトル
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String title;

  /**
   * / 表示枠サイズ
   */
  @WireField(
      tag = 4,
      adapter = "tv.abema.protos.DailyHighlightSlot$DisplaySize#ADAPTER"
  )
  public final DisplaySize displaySize;

  /**
   * / カテゴリID
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String highlightCategoryId;

  /**
   * / 画像名(代表番組の番組サムネ、シーンサムネのうち1つ/thumb01-06)
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String image;

  /**
   * / 並び順(0〜)
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer order;

  public DailyHighlightSlot(String date, String slotId, String title, DisplaySize displaySize, String highlightCategoryId, String image, Integer order) {
    this(date, slotId, title, displaySize, highlightCategoryId, image, order, ByteString.EMPTY);
  }

  public DailyHighlightSlot(String date, String slotId, String title, DisplaySize displaySize, String highlightCategoryId, String image, Integer order, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.date = date;
    this.slotId = slotId;
    this.title = title;
    this.displaySize = displaySize;
    this.highlightCategoryId = highlightCategoryId;
    this.image = image;
    this.order = order;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.date = date;
    builder.slotId = slotId;
    builder.title = title;
    builder.displaySize = displaySize;
    builder.highlightCategoryId = highlightCategoryId;
    builder.image = image;
    builder.order = order;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof DailyHighlightSlot)) return false;
    DailyHighlightSlot o = (DailyHighlightSlot) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(date, o.date)
        && Internal.equals(slotId, o.slotId)
        && Internal.equals(title, o.title)
        && Internal.equals(displaySize, o.displaySize)
        && Internal.equals(highlightCategoryId, o.highlightCategoryId)
        && Internal.equals(image, o.image)
        && Internal.equals(order, o.order);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (date != null ? date.hashCode() : 0);
      result = result * 37 + (slotId != null ? slotId.hashCode() : 0);
      result = result * 37 + (title != null ? title.hashCode() : 0);
      result = result * 37 + (displaySize != null ? displaySize.hashCode() : 0);
      result = result * 37 + (highlightCategoryId != null ? highlightCategoryId.hashCode() : 0);
      result = result * 37 + (image != null ? image.hashCode() : 0);
      result = result * 37 + (order != null ? order.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (date != null) builder.append(", date=").append(date);
    if (slotId != null) builder.append(", slotId=").append(slotId);
    if (title != null) builder.append(", title=").append(title);
    if (displaySize != null) builder.append(", displaySize=").append(displaySize);
    if (highlightCategoryId != null) builder.append(", highlightCategoryId=").append(highlightCategoryId);
    if (image != null) builder.append(", image=").append(image);
    if (order != null) builder.append(", order=").append(order);
    return builder.replace(0, 2, "DailyHighlightSlot{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<DailyHighlightSlot, Builder> {
    public String date;

    public String slotId;

    public String title;

    public DisplaySize displaySize;

    public String highlightCategoryId;

    public String image;

    public Integer order;

    public Builder() {
    }

    /**
     * / 日付(yyyyMMdd)
     */
    public Builder date(String date) {
      this.date = date;
      return this;
    }

    /**
     * / 枠ID
     */
    public Builder slotId(String slotId) {
      this.slotId = slotId;
      return this;
    }

    /**
     * / 見どころタイトル
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * / 表示枠サイズ
     */
    public Builder displaySize(DisplaySize displaySize) {
      this.displaySize = displaySize;
      return this;
    }

    /**
     * / カテゴリID
     */
    public Builder highlightCategoryId(String highlightCategoryId) {
      this.highlightCategoryId = highlightCategoryId;
      return this;
    }

    /**
     * / 画像名(代表番組の番組サムネ、シーンサムネのうち1つ/thumb01-06)
     */
    public Builder image(String image) {
      this.image = image;
      return this;
    }

    /**
     * / 並び順(0〜)
     */
    public Builder order(Integer order) {
      this.order = order;
      return this;
    }

    @Override
    public DailyHighlightSlot build() {
      return new DailyHighlightSlot(date, slotId, title, displaySize, highlightCategoryId, image, order, buildUnknownFields());
    }
  }

  /**
   * / 表示枠サイズ
   */
  public enum DisplaySize implements WireEnum {
    /**
     * / 通常
     */
    NORMAL(0),

    /**
     * / 大
     */
    BIG(1);

    public static final ProtoAdapter<DisplaySize> ADAPTER = ProtoAdapter.newEnumAdapter(DisplaySize.class);

    private final int value;

    DisplaySize(int value) {
      this.value = value;
    }

    /**
     * Return the constant for {@code value} or null.
     */
    public static DisplaySize fromValue(int value) {
      switch (value) {
        case 0: return NORMAL;
        case 1: return BIG;
        default: return null;
      }
    }

    @Override
    public int getValue() {
      return value;
    }
  }

  private static final class ProtoAdapter_DailyHighlightSlot extends ProtoAdapter<DailyHighlightSlot> {
    ProtoAdapter_DailyHighlightSlot() {
      super(FieldEncoding.LENGTH_DELIMITED, DailyHighlightSlot.class);
    }

    @Override
    public int encodedSize(DailyHighlightSlot value) {
      return (value.date != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.date) : 0)
          + (value.slotId != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.slotId) : 0)
          + (value.title != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.title) : 0)
          + (value.displaySize != null ? DisplaySize.ADAPTER.encodedSizeWithTag(4, value.displaySize) : 0)
          + (value.highlightCategoryId != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, value.highlightCategoryId) : 0)
          + (value.image != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, value.image) : 0)
          + (value.order != null ? ProtoAdapter.INT32.encodedSizeWithTag(7, value.order) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, DailyHighlightSlot value) throws IOException {
      if (value.date != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.date);
      if (value.slotId != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.slotId);
      if (value.title != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.title);
      if (value.displaySize != null) DisplaySize.ADAPTER.encodeWithTag(writer, 4, value.displaySize);
      if (value.highlightCategoryId != null) ProtoAdapter.STRING.encodeWithTag(writer, 5, value.highlightCategoryId);
      if (value.image != null) ProtoAdapter.STRING.encodeWithTag(writer, 6, value.image);
      if (value.order != null) ProtoAdapter.INT32.encodeWithTag(writer, 7, value.order);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public DailyHighlightSlot decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.date(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.slotId(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.title(ProtoAdapter.STRING.decode(reader)); break;
          case 4: {
            try {
              builder.displaySize(DisplaySize.ADAPTER.decode(reader));
            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
          case 5: builder.highlightCategoryId(ProtoAdapter.STRING.decode(reader)); break;
          case 6: builder.image(ProtoAdapter.STRING.decode(reader)); break;
          case 7: builder.order(ProtoAdapter.INT32.decode(reader)); break;
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
    public DailyHighlightSlot redact(DailyHighlightSlot value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
