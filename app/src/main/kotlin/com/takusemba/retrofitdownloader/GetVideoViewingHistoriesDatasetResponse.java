// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/video_viewing.proto at 77:1
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
 * / ビデオ視聴履歴一覧データセット取得レスポンス
 */
public final class GetVideoViewingHistoriesDatasetResponse extends Message<GetVideoViewingHistoriesDatasetResponse, GetVideoViewingHistoriesDatasetResponse.Builder> {
  public static final ProtoAdapter<GetVideoViewingHistoriesDatasetResponse> ADAPTER = new ProtoAdapter_GetVideoViewingHistoriesDatasetResponse();

  private static final long serialVersionUID = 0L;

  /**
   * / 視聴履歴
   */
  @WireField(
      tag = 1,
      adapter = "tv.abema.protos.VideoViewingHistory#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<VideoViewingHistory> histories;

  /**
   * / 視聴履歴データセット
   */
  @WireField(
      tag = 2,
      adapter = "tv.abema.protos.GetVideoViewingHistoriesDatasetResponse$DataSet#ADAPTER"
  )
  public final DataSet dataSet;

  /**
   * / ページングトークン
   */
  @WireField(
      tag = 3,
      adapter = "tv.abema.protos.GetVideoViewingHistoriesDatasetResponse$Paging#ADAPTER"
  )
  public final Paging paging;

  public GetVideoViewingHistoriesDatasetResponse(List<VideoViewingHistory> histories, DataSet dataSet, Paging paging) {
    this(histories, dataSet, paging, ByteString.EMPTY);
  }

  public GetVideoViewingHistoriesDatasetResponse(List<VideoViewingHistory> histories, DataSet dataSet, Paging paging, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.histories = Internal.immutableCopyOf("histories", histories);
    this.dataSet = dataSet;
    this.paging = paging;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.histories = Internal.copyOf("histories", histories);
    builder.dataSet = dataSet;
    builder.paging = paging;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetVideoViewingHistoriesDatasetResponse)) return false;
    GetVideoViewingHistoriesDatasetResponse o = (GetVideoViewingHistoriesDatasetResponse) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(histories, o.histories)
        && Internal.equals(dataSet, o.dataSet)
        && Internal.equals(paging, o.paging);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (histories != null ? histories.hashCode() : 1);
      result = result * 37 + (dataSet != null ? dataSet.hashCode() : 0);
      result = result * 37 + (paging != null ? paging.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (histories != null) builder.append(", histories=").append(histories);
    if (dataSet != null) builder.append(", dataSet=").append(dataSet);
    if (paging != null) builder.append(", paging=").append(paging);
    return builder.replace(0, 2, "GetVideoViewingHistoriesDatasetResponse{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetVideoViewingHistoriesDatasetResponse, Builder> {
    public List<VideoViewingHistory> histories;

    public DataSet dataSet;

    public Paging paging;

    public Builder() {
      histories = Internal.newMutableList();
    }

    /**
     * / 視聴履歴
     */
    public Builder histories(List<VideoViewingHistory> histories) {
      Internal.checkElementsNotNull(histories);
      this.histories = histories;
      return this;
    }

    /**
     * / 視聴履歴データセット
     */
    public Builder dataSet(DataSet dataSet) {
      this.dataSet = dataSet;
      return this;
    }

    /**
     * / ページングトークン
     */
    public Builder paging(Paging paging) {
      this.paging = paging;
      return this;
    }

    @Override
    public GetVideoViewingHistoriesDatasetResponse build() {
      return new GetVideoViewingHistoriesDatasetResponse(histories, dataSet, paging, buildUnknownFields());
    }
  }

  public static final class DataSet extends Message<DataSet, DataSet.Builder> {
    public static final ProtoAdapter<DataSet> ADAPTER = new ProtoAdapter_DataSet();

    private static final long serialVersionUID = 0L;

    /**
     * / 視聴コンテンツTimeshift
     */
    @WireField(
        tag = 1,
        adapter = "tv.abema.protos.VideoViewingContentTimeshift#ADAPTER",
        label = WireField.Label.REPEATED
    )
    public final List<VideoViewingContentTimeshift> timeshifts;

    /**
     * / 視聴コンテンツVOD
     */
    @WireField(
        tag = 2,
        adapter = "tv.abema.protos.VideoViewingContentVOD#ADAPTER",
        label = WireField.Label.REPEATED
    )
    public final List<VideoViewingContentVOD> vods;

    public DataSet(List<VideoViewingContentTimeshift> timeshifts, List<VideoViewingContentVOD> vods) {
      this(timeshifts, vods, ByteString.EMPTY);
    }

    public DataSet(List<VideoViewingContentTimeshift> timeshifts, List<VideoViewingContentVOD> vods, ByteString unknownFields) {
      super(ADAPTER, unknownFields);
      this.timeshifts = Internal.immutableCopyOf("timeshifts", timeshifts);
      this.vods = Internal.immutableCopyOf("vods", vods);
    }

    @Override
    public Builder newBuilder() {
      Builder builder = new Builder();
      builder.timeshifts = Internal.copyOf("timeshifts", timeshifts);
      builder.vods = Internal.copyOf("vods", vods);
      builder.addUnknownFields(unknownFields());
      return builder;
    }

    @Override
    public boolean equals(Object other) {
      if (other == this) return true;
      if (!(other instanceof DataSet)) return false;
      DataSet o = (DataSet) other;
      return Internal.equals(unknownFields(), o.unknownFields())
          && Internal.equals(timeshifts, o.timeshifts)
          && Internal.equals(vods, o.vods);
    }

    @Override
    public int hashCode() {
      int result = super.hashCode;
      if (result == 0) {
        result = unknownFields().hashCode();
        result = result * 37 + (timeshifts != null ? timeshifts.hashCode() : 1);
        result = result * 37 + (vods != null ? vods.hashCode() : 1);
        super.hashCode = result;
      }
      return result;
    }

    @Override
    public String toString() {
      StringBuilder builder = new StringBuilder();
      if (timeshifts != null) builder.append(", timeshifts=").append(timeshifts);
      if (vods != null) builder.append(", vods=").append(vods);
      return builder.replace(0, 2, "DataSet{").append('}').toString();
    }

    public static final class Builder extends Message.Builder<DataSet, Builder> {
      public List<VideoViewingContentTimeshift> timeshifts;

      public List<VideoViewingContentVOD> vods;

      public Builder() {
        timeshifts = Internal.newMutableList();
        vods = Internal.newMutableList();
      }

      /**
       * / 視聴コンテンツTimeshift
       */
      public Builder timeshifts(List<VideoViewingContentTimeshift> timeshifts) {
        Internal.checkElementsNotNull(timeshifts);
        this.timeshifts = timeshifts;
        return this;
      }

      /**
       * / 視聴コンテンツVOD
       */
      public Builder vods(List<VideoViewingContentVOD> vods) {
        Internal.checkElementsNotNull(vods);
        this.vods = vods;
        return this;
      }

      @Override
      public DataSet build() {
        return new DataSet(timeshifts, vods, buildUnknownFields());
      }
    }

    private static final class ProtoAdapter_DataSet extends ProtoAdapter<DataSet> {
      ProtoAdapter_DataSet() {
        super(FieldEncoding.LENGTH_DELIMITED, DataSet.class);
      }

      @Override
      public int encodedSize(DataSet value) {
        return VideoViewingContentTimeshift.ADAPTER.asRepeated().encodedSizeWithTag(1, value.timeshifts)
            + VideoViewingContentVOD.ADAPTER.asRepeated().encodedSizeWithTag(2, value.vods)
            + value.unknownFields().size();
      }

      @Override
      public void encode(ProtoWriter writer, DataSet value) throws IOException {
        if (value.timeshifts != null) VideoViewingContentTimeshift.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.timeshifts);
        if (value.vods != null) VideoViewingContentVOD.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.vods);
        writer.writeBytes(value.unknownFields());
      }

      @Override
      public DataSet decode(ProtoReader reader) throws IOException {
        Builder builder = new Builder();
        long token = reader.beginMessage();
        for (int tag; (tag = reader.nextTag()) != -1;) {
          switch (tag) {
            case 1: builder.timeshifts.add(VideoViewingContentTimeshift.ADAPTER.decode(reader)); break;
            case 2: builder.vods.add(VideoViewingContentVOD.ADAPTER.decode(reader)); break;
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
        Internal.redactElements(builder.timeshifts, VideoViewingContentTimeshift.ADAPTER);
        Internal.redactElements(builder.vods, VideoViewingContentVOD.ADAPTER);
        builder.clearUnknownFields();
        return builder.build();
      }
    }
  }

  public static final class Paging extends Message<Paging, Paging.Builder> {
    public static final ProtoAdapter<Paging> ADAPTER = new ProtoAdapter_Paging();

    private static final long serialVersionUID = 0L;

    public static final String DEFAULT_NEXT = "";

    /**
     * / A paging parameter for getting next video viewing history.
     */
    @WireField(
        tag = 1,
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
    )
    public final String next;

    public Paging(String next) {
      this(next, ByteString.EMPTY);
    }

    public Paging(String next, ByteString unknownFields) {
      super(ADAPTER, unknownFields);
      this.next = next;
    }

    @Override
    public Builder newBuilder() {
      Builder builder = new Builder();
      builder.next = next;
      builder.addUnknownFields(unknownFields());
      return builder;
    }

    @Override
    public boolean equals(Object other) {
      if (other == this) return true;
      if (!(other instanceof Paging)) return false;
      Paging o = (Paging) other;
      return Internal.equals(unknownFields(), o.unknownFields())
          && Internal.equals(next, o.next);
    }

    @Override
    public int hashCode() {
      int result = super.hashCode;
      if (result == 0) {
        result = unknownFields().hashCode();
        result = result * 37 + (next != null ? next.hashCode() : 0);
        super.hashCode = result;
      }
      return result;
    }

    @Override
    public String toString() {
      StringBuilder builder = new StringBuilder();
      if (next != null) builder.append(", next=").append(next);
      return builder.replace(0, 2, "Paging{").append('}').toString();
    }

    public static final class Builder extends Message.Builder<Paging, Builder> {
      public String next;

      public Builder() {
      }

      /**
       * / A paging parameter for getting next video viewing history.
       */
      public Builder next(String next) {
        this.next = next;
        return this;
      }

      @Override
      public Paging build() {
        return new Paging(next, buildUnknownFields());
      }
    }

    private static final class ProtoAdapter_Paging extends ProtoAdapter<Paging> {
      ProtoAdapter_Paging() {
        super(FieldEncoding.LENGTH_DELIMITED, Paging.class);
      }

      @Override
      public int encodedSize(Paging value) {
        return (value.next != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.next) : 0)
            + value.unknownFields().size();
      }

      @Override
      public void encode(ProtoWriter writer, Paging value) throws IOException {
        if (value.next != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.next);
        writer.writeBytes(value.unknownFields());
      }

      @Override
      public Paging decode(ProtoReader reader) throws IOException {
        Builder builder = new Builder();
        long token = reader.beginMessage();
        for (int tag; (tag = reader.nextTag()) != -1;) {
          switch (tag) {
            case 1: builder.next(ProtoAdapter.STRING.decode(reader)); break;
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
      public Paging redact(Paging value) {
        Builder builder = value.newBuilder();
        builder.clearUnknownFields();
        return builder.build();
      }
    }
  }

  private static final class ProtoAdapter_GetVideoViewingHistoriesDatasetResponse extends ProtoAdapter<GetVideoViewingHistoriesDatasetResponse> {
    ProtoAdapter_GetVideoViewingHistoriesDatasetResponse() {
      super(FieldEncoding.LENGTH_DELIMITED, GetVideoViewingHistoriesDatasetResponse.class);
    }

    @Override
    public int encodedSize(GetVideoViewingHistoriesDatasetResponse value) {
      return VideoViewingHistory.ADAPTER.asRepeated().encodedSizeWithTag(1, value.histories)
          + (value.dataSet != null ? DataSet.ADAPTER.encodedSizeWithTag(2, value.dataSet) : 0)
          + (value.paging != null ? Paging.ADAPTER.encodedSizeWithTag(3, value.paging) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetVideoViewingHistoriesDatasetResponse value) throws IOException {
      if (value.histories != null) VideoViewingHistory.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.histories);
      if (value.dataSet != null) DataSet.ADAPTER.encodeWithTag(writer, 2, value.dataSet);
      if (value.paging != null) Paging.ADAPTER.encodeWithTag(writer, 3, value.paging);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetVideoViewingHistoriesDatasetResponse decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.histories.add(VideoViewingHistory.ADAPTER.decode(reader)); break;
          case 2: builder.dataSet(DataSet.ADAPTER.decode(reader)); break;
          case 3: builder.paging(Paging.ADAPTER.decode(reader)); break;
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
    public GetVideoViewingHistoriesDatasetResponse redact(GetVideoViewingHistoriesDatasetResponse value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.histories, VideoViewingHistory.ADAPTER);
      if (builder.dataSet != null) builder.dataSet = DataSet.ADAPTER.redact(builder.dataSet);
      if (builder.paging != null) builder.paging = Paging.ADAPTER.redact(builder.paging);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
