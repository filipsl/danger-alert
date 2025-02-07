// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: danger-alert.proto

package sr.grpc.gen;

/**
 * Protobuf type {@code alert.StateCodes}
 */
public  final class StateCodes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alert.StateCodes)
    StateCodesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StateCodes.newBuilder() to construct.
  private StateCodes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StateCodes() {
    stateCodes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StateCodes();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StateCodes(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              stateCodes_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            stateCodes_.add(s);
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        stateCodes_ = stateCodes_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return sr.grpc.gen.DangerAlert.internal_static_alert_StateCodes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return sr.grpc.gen.DangerAlert.internal_static_alert_StateCodes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            sr.grpc.gen.StateCodes.class, sr.grpc.gen.StateCodes.Builder.class);
  }

  public static final int STATECODES_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList stateCodes_;
  /**
   * <code>repeated string stateCodes = 1;</code>
   * @return A list containing the stateCodes.
   */
  public com.google.protobuf.ProtocolStringList
      getStateCodesList() {
    return stateCodes_;
  }
  /**
   * <code>repeated string stateCodes = 1;</code>
   * @return The count of stateCodes.
   */
  public int getStateCodesCount() {
    return stateCodes_.size();
  }
  /**
   * <code>repeated string stateCodes = 1;</code>
   * @param index The index of the element to return.
   * @return The stateCodes at the given index.
   */
  public java.lang.String getStateCodes(int index) {
    return stateCodes_.get(index);
  }
  /**
   * <code>repeated string stateCodes = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the stateCodes at the given index.
   */
  public com.google.protobuf.ByteString
      getStateCodesBytes(int index) {
    return stateCodes_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < stateCodes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, stateCodes_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < stateCodes_.size(); i++) {
        dataSize += computeStringSizeNoTag(stateCodes_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getStateCodesList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof sr.grpc.gen.StateCodes)) {
      return super.equals(obj);
    }
    sr.grpc.gen.StateCodes other = (sr.grpc.gen.StateCodes) obj;

    if (!getStateCodesList()
        .equals(other.getStateCodesList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getStateCodesCount() > 0) {
      hash = (37 * hash) + STATECODES_FIELD_NUMBER;
      hash = (53 * hash) + getStateCodesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static sr.grpc.gen.StateCodes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sr.grpc.gen.StateCodes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sr.grpc.gen.StateCodes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sr.grpc.gen.StateCodes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sr.grpc.gen.StateCodes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sr.grpc.gen.StateCodes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sr.grpc.gen.StateCodes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sr.grpc.gen.StateCodes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static sr.grpc.gen.StateCodes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static sr.grpc.gen.StateCodes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static sr.grpc.gen.StateCodes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sr.grpc.gen.StateCodes parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(sr.grpc.gen.StateCodes prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code alert.StateCodes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alert.StateCodes)
      sr.grpc.gen.StateCodesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sr.grpc.gen.DangerAlert.internal_static_alert_StateCodes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sr.grpc.gen.DangerAlert.internal_static_alert_StateCodes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sr.grpc.gen.StateCodes.class, sr.grpc.gen.StateCodes.Builder.class);
    }

    // Construct using sr.grpc.gen.StateCodes.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      stateCodes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return sr.grpc.gen.DangerAlert.internal_static_alert_StateCodes_descriptor;
    }

    @java.lang.Override
    public sr.grpc.gen.StateCodes getDefaultInstanceForType() {
      return sr.grpc.gen.StateCodes.getDefaultInstance();
    }

    @java.lang.Override
    public sr.grpc.gen.StateCodes build() {
      sr.grpc.gen.StateCodes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public sr.grpc.gen.StateCodes buildPartial() {
      sr.grpc.gen.StateCodes result = new sr.grpc.gen.StateCodes(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        stateCodes_ = stateCodes_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.stateCodes_ = stateCodes_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof sr.grpc.gen.StateCodes) {
        return mergeFrom((sr.grpc.gen.StateCodes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(sr.grpc.gen.StateCodes other) {
      if (other == sr.grpc.gen.StateCodes.getDefaultInstance()) return this;
      if (!other.stateCodes_.isEmpty()) {
        if (stateCodes_.isEmpty()) {
          stateCodes_ = other.stateCodes_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureStateCodesIsMutable();
          stateCodes_.addAll(other.stateCodes_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      sr.grpc.gen.StateCodes parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (sr.grpc.gen.StateCodes) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList stateCodes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureStateCodesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        stateCodes_ = new com.google.protobuf.LazyStringArrayList(stateCodes_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string stateCodes = 1;</code>
     * @return A list containing the stateCodes.
     */
    public com.google.protobuf.ProtocolStringList
        getStateCodesList() {
      return stateCodes_.getUnmodifiableView();
    }
    /**
     * <code>repeated string stateCodes = 1;</code>
     * @return The count of stateCodes.
     */
    public int getStateCodesCount() {
      return stateCodes_.size();
    }
    /**
     * <code>repeated string stateCodes = 1;</code>
     * @param index The index of the element to return.
     * @return The stateCodes at the given index.
     */
    public java.lang.String getStateCodes(int index) {
      return stateCodes_.get(index);
    }
    /**
     * <code>repeated string stateCodes = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the stateCodes at the given index.
     */
    public com.google.protobuf.ByteString
        getStateCodesBytes(int index) {
      return stateCodes_.getByteString(index);
    }
    /**
     * <code>repeated string stateCodes = 1;</code>
     * @param index The index to set the value at.
     * @param value The stateCodes to set.
     * @return This builder for chaining.
     */
    public Builder setStateCodes(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureStateCodesIsMutable();
      stateCodes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string stateCodes = 1;</code>
     * @param value The stateCodes to add.
     * @return This builder for chaining.
     */
    public Builder addStateCodes(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureStateCodesIsMutable();
      stateCodes_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string stateCodes = 1;</code>
     * @param values The stateCodes to add.
     * @return This builder for chaining.
     */
    public Builder addAllStateCodes(
        java.lang.Iterable<java.lang.String> values) {
      ensureStateCodesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, stateCodes_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string stateCodes = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStateCodes() {
      stateCodes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string stateCodes = 1;</code>
     * @param value The bytes of the stateCodes to add.
     * @return This builder for chaining.
     */
    public Builder addStateCodesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureStateCodesIsMutable();
      stateCodes_.add(value);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:alert.StateCodes)
  }

  // @@protoc_insertion_point(class_scope:alert.StateCodes)
  private static final sr.grpc.gen.StateCodes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new sr.grpc.gen.StateCodes();
  }

  public static sr.grpc.gen.StateCodes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StateCodes>
      PARSER = new com.google.protobuf.AbstractParser<StateCodes>() {
    @java.lang.Override
    public StateCodes parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StateCodes(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StateCodes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StateCodes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public sr.grpc.gen.StateCodes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

