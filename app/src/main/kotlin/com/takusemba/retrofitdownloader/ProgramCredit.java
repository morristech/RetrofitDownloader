// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/media.proto at 211:1
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
 * / 番組クレジット情報
 */
public final class ProgramCredit extends Message<ProgramCredit, ProgramCredit.Builder> {
  public static final ProtoAdapter<ProgramCredit> ADAPTER = new ProtoAdapter_ProgramCredit();

  private static final long serialVersionUID = 0L;

  /**
   * / キャスト名
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REPEATED
  )
  public final List<String> casts;

  /**
   * / スタッフ名
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REPEATED
  )
  public final List<String> crews;

  /**
   * / コピーライト
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REPEATED
  )
  public final List<String> copyrights;

  public ProgramCredit(List<String> casts, List<String> crews, List<String> copyrights) {
    this(casts, crews, copyrights, ByteString.EMPTY);
  }

  public ProgramCredit(List<String> casts, List<String> crews, List<String> copyrights, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.casts = Internal.immutableCopyOf("casts", casts);
    this.crews = Internal.immutableCopyOf("crews", crews);
    this.copyrights = Internal.immutableCopyOf("copyrights", copyrights);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.casts = Internal.copyOf("casts", casts);
    builder.crews = Internal.copyOf("crews", crews);
    builder.copyrights = Internal.copyOf("copyrights", copyrights);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ProgramCredit)) return false;
    ProgramCredit o = (ProgramCredit) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(casts, o.casts)
        && Internal.equals(crews, o.crews)
        && Internal.equals(copyrights, o.copyrights);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (casts != null ? casts.hashCode() : 1);
      result = result * 37 + (crews != null ? crews.hashCode() : 1);
      result = result * 37 + (copyrights != null ? copyrights.hashCode() : 1);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (casts != null) builder.append(", casts=").append(casts);
    if (crews != null) builder.append(", crews=").append(crews);
    if (copyrights != null) builder.append(", copyrights=").append(copyrights);
    return builder.replace(0, 2, "ProgramCredit{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<ProgramCredit, Builder> {
    public List<String> casts;

    public List<String> crews;

    public List<String> copyrights;

    public Builder() {
      casts = Internal.newMutableList();
      crews = Internal.newMutableList();
      copyrights = Internal.newMutableList();
    }

    /**
     * / キャスト名
     */
    public Builder casts(List<String> casts) {
      Internal.checkElementsNotNull(casts);
      this.casts = casts;
      return this;
    }

    /**
     * / スタッフ名
     */
    public Builder crews(List<String> crews) {
      Internal.checkElementsNotNull(crews);
      this.crews = crews;
      return this;
    }

    /**
     * / コピーライト
     */
    public Builder copyrights(List<String> copyrights) {
      Internal.checkElementsNotNull(copyrights);
      this.copyrights = copyrights;
      return this;
    }

    @Override
    public ProgramCredit build() {
      return new ProgramCredit(casts, crews, copyrights, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_ProgramCredit extends ProtoAdapter<ProgramCredit> {
    ProtoAdapter_ProgramCredit() {
      super(FieldEncoding.LENGTH_DELIMITED, ProgramCredit.class);
    }

    @Override
    public int encodedSize(ProgramCredit value) {
      return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, value.casts)
          + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, value.crews)
          + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, value.copyrights)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, ProgramCredit value) throws IOException {
      if (value.casts != null) ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, value.casts);
      if (value.crews != null) ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 2, value.crews);
      if (value.copyrights != null) ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 4, value.copyrights);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public ProgramCredit decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.casts.add(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.crews.add(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.copyrights.add(ProtoAdapter.STRING.decode(reader)); break;
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
    public ProgramCredit redact(ProgramCredit value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
