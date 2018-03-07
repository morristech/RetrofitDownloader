// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/dataset.proto at 14:1
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
 * / データセット情報
 */
public final class DataSet extends Message<DataSet, DataSet.Builder> {
  public static final ProtoAdapter<DataSet> ADAPTER = new ProtoAdapter_DataSet();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_PUBLISHEDAT = 0L;

  /**
   * / チャネル一覧
   */
  @WireField(
      tag = 1,
      adapter = "tv.abema.protos.Channel#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<Channel> channels;

  /**
   * / 放送枠一覧
   */
  @WireField(
      tag = 2,
      adapter = "tv.abema.protos.Slot#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<Slot> slots;

  /**
   * / 番組一覧
   */
  @WireField(
      tag = 3,
      adapter = "tv.abema.protos.Program#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<Program> programs;

  /**
   * / シリーズ一覧
   */
  @WireField(
      tag = 4,
      adapter = "tv.abema.protos.Series#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<Series> series;

  /**
   * / 日付(YYYYMMDD)一覧
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REPEATED
  )
  public final List<String> availableDates;

  /**
   * / 放送枠グループ一覧
   */
  @WireField(
      tag = 6,
      adapter = "tv.abema.protos.SlotGroup#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<SlotGroup> slotGroups;

  /**
   * / 番組表Snapshot公開日時
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long publishedAt;

  public DataSet(List<Channel> channels, List<Slot> slots, List<Program> programs, List<Series> series, List<String> availableDates, List<SlotGroup> slotGroups, Long publishedAt) {
    this(channels, slots, programs, series, availableDates, slotGroups, publishedAt, ByteString.EMPTY);
  }

  public DataSet(List<Channel> channels, List<Slot> slots, List<Program> programs, List<Series> series, List<String> availableDates, List<SlotGroup> slotGroups, Long publishedAt, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.channels = Internal.immutableCopyOf("channels", channels);
    this.slots = Internal.immutableCopyOf("slots", slots);
    this.programs = Internal.immutableCopyOf("programs", programs);
    this.series = Internal.immutableCopyOf("series", series);
    this.availableDates = Internal.immutableCopyOf("availableDates", availableDates);
    this.slotGroups = Internal.immutableCopyOf("slotGroups", slotGroups);
    this.publishedAt = publishedAt;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.channels = Internal.copyOf("channels", channels);
    builder.slots = Internal.copyOf("slots", slots);
    builder.programs = Internal.copyOf("programs", programs);
    builder.series = Internal.copyOf("series", series);
    builder.availableDates = Internal.copyOf("availableDates", availableDates);
    builder.slotGroups = Internal.copyOf("slotGroups", slotGroups);
    builder.publishedAt = publishedAt;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof DataSet)) return false;
    DataSet o = (DataSet) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(channels, o.channels)
        && Internal.equals(slots, o.slots)
        && Internal.equals(programs, o.programs)
        && Internal.equals(series, o.series)
        && Internal.equals(availableDates, o.availableDates)
        && Internal.equals(slotGroups, o.slotGroups)
        && Internal.equals(publishedAt, o.publishedAt);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (channels != null ? channels.hashCode() : 1);
      result = result * 37 + (slots != null ? slots.hashCode() : 1);
      result = result * 37 + (programs != null ? programs.hashCode() : 1);
      result = result * 37 + (series != null ? series.hashCode() : 1);
      result = result * 37 + (availableDates != null ? availableDates.hashCode() : 1);
      result = result * 37 + (slotGroups != null ? slotGroups.hashCode() : 1);
      result = result * 37 + (publishedAt != null ? publishedAt.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (channels != null) builder.append(", channels=").append(channels);
    if (slots != null) builder.append(", slots=").append(slots);
    if (programs != null) builder.append(", programs=").append(programs);
    if (series != null) builder.append(", series=").append(series);
    if (availableDates != null) builder.append(", availableDates=").append(availableDates);
    if (slotGroups != null) builder.append(", slotGroups=").append(slotGroups);
    if (publishedAt != null) builder.append(", publishedAt=").append(publishedAt);
    return builder.replace(0, 2, "DataSet{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<DataSet, Builder> {
    public List<Channel> channels;

    public List<Slot> slots;

    public List<Program> programs;

    public List<Series> series;

    public List<String> availableDates;

    public List<SlotGroup> slotGroups;

    public Long publishedAt;

    public Builder() {
      channels = Internal.newMutableList();
      slots = Internal.newMutableList();
      programs = Internal.newMutableList();
      series = Internal.newMutableList();
      availableDates = Internal.newMutableList();
      slotGroups = Internal.newMutableList();
    }

    /**
     * / チャネル一覧
     */
    public Builder channels(List<Channel> channels) {
      Internal.checkElementsNotNull(channels);
      this.channels = channels;
      return this;
    }

    /**
     * / 放送枠一覧
     */
    public Builder slots(List<Slot> slots) {
      Internal.checkElementsNotNull(slots);
      this.slots = slots;
      return this;
    }

    /**
     * / 番組一覧
     */
    public Builder programs(List<Program> programs) {
      Internal.checkElementsNotNull(programs);
      this.programs = programs;
      return this;
    }

    /**
     * / シリーズ一覧
     */
    public Builder series(List<Series> series) {
      Internal.checkElementsNotNull(series);
      this.series = series;
      return this;
    }

    /**
     * / 日付(YYYYMMDD)一覧
     */
    public Builder availableDates(List<String> availableDates) {
      Internal.checkElementsNotNull(availableDates);
      this.availableDates = availableDates;
      return this;
    }

    /**
     * / 放送枠グループ一覧
     */
    public Builder slotGroups(List<SlotGroup> slotGroups) {
      Internal.checkElementsNotNull(slotGroups);
      this.slotGroups = slotGroups;
      return this;
    }

    /**
     * / 番組表Snapshot公開日時
     */
    public Builder publishedAt(Long publishedAt) {
      this.publishedAt = publishedAt;
      return this;
    }

    @Override
    public DataSet build() {
      return new DataSet(channels, slots, programs, series, availableDates, slotGroups, publishedAt, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_DataSet extends ProtoAdapter<DataSet> {
    ProtoAdapter_DataSet() {
      super(FieldEncoding.LENGTH_DELIMITED, DataSet.class);
    }

    @Override
    public int encodedSize(DataSet value) {
      return Channel.ADAPTER.asRepeated().encodedSizeWithTag(1, value.channels)
          + Slot.ADAPTER.asRepeated().encodedSizeWithTag(2, value.slots)
          + Program.ADAPTER.asRepeated().encodedSizeWithTag(3, value.programs)
          + Series.ADAPTER.asRepeated().encodedSizeWithTag(4, value.series)
          + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(5, value.availableDates)
          + SlotGroup.ADAPTER.asRepeated().encodedSizeWithTag(6, value.slotGroups)
          + (value.publishedAt != null ? ProtoAdapter.INT64.encodedSizeWithTag(7, value.publishedAt) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, DataSet value) throws IOException {
      if (value.channels != null) Channel.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.channels);
      if (value.slots != null) Slot.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.slots);
      if (value.programs != null) Program.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.programs);
      if (value.series != null) Series.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.series);
      if (value.availableDates != null) ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 5, value.availableDates);
      if (value.slotGroups != null) SlotGroup.ADAPTER.asRepeated().encodeWithTag(writer, 6, value.slotGroups);
      if (value.publishedAt != null) ProtoAdapter.INT64.encodeWithTag(writer, 7, value.publishedAt);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public DataSet decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.channels.add(Channel.ADAPTER.decode(reader)); break;
          case 2: builder.slots.add(Slot.ADAPTER.decode(reader)); break;
          case 3: builder.programs.add(Program.ADAPTER.decode(reader)); break;
          case 4: builder.series.add(Series.ADAPTER.decode(reader)); break;
          case 5: builder.availableDates.add(ProtoAdapter.STRING.decode(reader)); break;
          case 6: builder.slotGroups.add(SlotGroup.ADAPTER.decode(reader)); break;
          case 7: builder.publishedAt(ProtoAdapter.INT64.decode(reader)); break;
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
    public DataSet redact(DataSet value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.channels, Channel.ADAPTER);
      Internal.redactElements(builder.slots, Slot.ADAPTER);
      Internal.redactElements(builder.programs, Program.ADAPTER);
      Internal.redactElements(builder.series, Series.ADAPTER);
      Internal.redactElements(builder.slotGroups, SlotGroup.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
