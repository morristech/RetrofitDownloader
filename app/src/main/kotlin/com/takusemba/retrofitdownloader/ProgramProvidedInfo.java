// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/media.proto at 218:1
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
 * / 番組納品情報
 */
public final class ProgramProvidedInfo extends Message<ProgramProvidedInfo, ProgramProvidedInfo.Builder> {
  public static final ProtoAdapter<ProgramProvidedInfo> ADAPTER = new ProtoAdapter_ProgramProvidedInfo();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_THUMBIMG = "";

  public static final Long DEFAULT_UPDATEDAT = 0L;

  /**
   * / 番組サムネ画像ファイル名(thumb001)
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String thumbImg;

  /**
   * / 番組シーンサムネ画像ファイル名(thumb002-thumb006)
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REPEATED
  )
  public final List<String> sceneThumbImgs;

  /**
   * / 更新時刻
   */
  @WireField(
      tag = 15,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long updatedAt;

  public ProgramProvidedInfo(String thumbImg, List<String> sceneThumbImgs, Long updatedAt) {
    this(thumbImg, sceneThumbImgs, updatedAt, ByteString.EMPTY);
  }

  public ProgramProvidedInfo(String thumbImg, List<String> sceneThumbImgs, Long updatedAt, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.thumbImg = thumbImg;
    this.sceneThumbImgs = Internal.immutableCopyOf("sceneThumbImgs", sceneThumbImgs);
    this.updatedAt = updatedAt;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.thumbImg = thumbImg;
    builder.sceneThumbImgs = Internal.copyOf("sceneThumbImgs", sceneThumbImgs);
    builder.updatedAt = updatedAt;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ProgramProvidedInfo)) return false;
    ProgramProvidedInfo o = (ProgramProvidedInfo) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(thumbImg, o.thumbImg)
        && Internal.equals(sceneThumbImgs, o.sceneThumbImgs)
        && Internal.equals(updatedAt, o.updatedAt);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (thumbImg != null ? thumbImg.hashCode() : 0);
      result = result * 37 + (sceneThumbImgs != null ? sceneThumbImgs.hashCode() : 1);
      result = result * 37 + (updatedAt != null ? updatedAt.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (thumbImg != null) builder.append(", thumbImg=").append(thumbImg);
    if (sceneThumbImgs != null) builder.append(", sceneThumbImgs=").append(sceneThumbImgs);
    if (updatedAt != null) builder.append(", updatedAt=").append(updatedAt);
    return builder.replace(0, 2, "ProgramProvidedInfo{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<ProgramProvidedInfo, Builder> {
    public String thumbImg;

    public List<String> sceneThumbImgs;

    public Long updatedAt;

    public Builder() {
      sceneThumbImgs = Internal.newMutableList();
    }

    /**
     * / 番組サムネ画像ファイル名(thumb001)
     */
    public Builder thumbImg(String thumbImg) {
      this.thumbImg = thumbImg;
      return this;
    }

    /**
     * / 番組シーンサムネ画像ファイル名(thumb002-thumb006)
     */
    public Builder sceneThumbImgs(List<String> sceneThumbImgs) {
      Internal.checkElementsNotNull(sceneThumbImgs);
      this.sceneThumbImgs = sceneThumbImgs;
      return this;
    }

    /**
     * / 更新時刻
     */
    public Builder updatedAt(Long updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    @Override
    public ProgramProvidedInfo build() {
      return new ProgramProvidedInfo(thumbImg, sceneThumbImgs, updatedAt, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_ProgramProvidedInfo extends ProtoAdapter<ProgramProvidedInfo> {
    ProtoAdapter_ProgramProvidedInfo() {
      super(FieldEncoding.LENGTH_DELIMITED, ProgramProvidedInfo.class);
    }

    @Override
    public int encodedSize(ProgramProvidedInfo value) {
      return (value.thumbImg != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.thumbImg) : 0)
          + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, value.sceneThumbImgs)
          + (value.updatedAt != null ? ProtoAdapter.INT64.encodedSizeWithTag(15, value.updatedAt) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, ProgramProvidedInfo value) throws IOException {
      if (value.thumbImg != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.thumbImg);
      if (value.sceneThumbImgs != null) ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 2, value.sceneThumbImgs);
      if (value.updatedAt != null) ProtoAdapter.INT64.encodeWithTag(writer, 15, value.updatedAt);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public ProgramProvidedInfo decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.thumbImg(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.sceneThumbImgs.add(ProtoAdapter.STRING.decode(reader)); break;
          case 15: builder.updatedAt(ProtoAdapter.INT64.decode(reader)); break;
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
    public ProgramProvidedInfo redact(ProgramProvidedInfo value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
