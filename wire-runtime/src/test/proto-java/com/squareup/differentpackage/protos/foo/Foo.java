// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/differentpackage/foo.proto at 7:1
package com.squareup.differentpackage.protos.foo;

import com.squareup.differentpackage.protos.bar.Bar;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.lang.Object;
import java.lang.Override;
import okio.ByteString;

public final class Foo extends Message<Foo> {
  public static final ProtoAdapter<Foo> ADAPTER = ProtoAdapter.newMessageAdapter(Foo.class);

  private static final long serialVersionUID = 0L;

  @WireField(
      tag = 1,
      adapter = "com.squareup.differentpackage.protos.bar.Bar$Baz$Moo#ADAPTER"
  )
  public final Bar.Baz.Moo moo;

  public Foo(Bar.Baz.Moo moo) {
    this(moo, ByteString.EMPTY);
  }

  public Foo(Bar.Baz.Moo moo, ByteString unknownFields) {
    super(unknownFields);
    this.moo = moo;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Foo)) return false;
    Foo o = (Foo) other;
    return equals(unknownFields(), o.unknownFields())
        && equals(moo, o.moo);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (moo != null ? moo.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<Foo, Builder> {
    public Bar.Baz.Moo moo;

    public Builder() {
    }

    public Builder(Foo message) {
      super(message);
      if (message == null) return;
      this.moo = message.moo;
    }

    public Builder moo(Bar.Baz.Moo moo) {
      this.moo = moo;
      return this;
    }

    @Override
    public Foo build() {
      return new Foo(moo, buildUnknownFields());
    }
  }
}
