// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: danger-alert.proto

package sr.grpc.gen;

public final class DangerAlert {
  private DangerAlert() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_alert_StateCodes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_alert_StateCodes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_alert_StateAlertFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_alert_StateAlertFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_alert_SubscriptionParams_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_alert_SubscriptionParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_alert_Alert_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_alert_Alert_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_alert_Alert_CityLevel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_alert_Alert_CityLevel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_alert_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_alert_Empty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022danger-alert.proto\022\005alert\" \n\nStateCode" +
      "s\022\022\n\nstateCodes\030\001 \003(\t\"M\n\020StateAlertFilte" +
      "r\022\021\n\tstateCode\030\001 \001(\t\022&\n\013dangerTypes\030\002 \003(" +
      "\0162\021.alert.DangerType\"C\n\022SubscriptionPara" +
      "ms\022-\n\014alertFilters\030\001 \003(\0132\027.alert.StateAl" +
      "ertFilter\"\320\001\n\005Alert\022\021\n\tstateName\030\001 \001(\t\022\021" +
      "\n\tstateCode\030\002 \001(\t\022%\n\ndangerType\030\003 \001(\0162\021." +
      "alert.DangerType\022.\n\016affectedCities\030\004 \003(\013" +
      "2\026.alert.Alert.CityLevel\032J\n\tCityLevel\022\020\n" +
      "\010cityName\030\001 \001(\t\022+\n\rseverityLevel\030\002 \001(\0162\024" +
      ".alert.SeverityLevel\"\007\n\005Empty*D\n\nDangerT" +
      "ype\022\r\n\tHURRICANE\020\000\022\t\n\005FLOOD\020\001\022\016\n\nEARTHQU" +
      "AKE\020\002\022\014\n\010BLIZZARD\020\003*.\n\rSeverityLevel\022\007\n\003" +
      "LOW\020\000\022\n\n\006MEDIUM\020\001\022\010\n\004HIGH\020\0022w\n\014AlertServ" +
      "ice\022-\n\010GetCodes\022\014.alert.Empty\032\021.alert.St" +
      "ateCodes\"\000\0228\n\tGetAlerts\022\031.alert.Subscrip" +
      "tionParams\032\014.alert.Alert\"\0000\001B\034\n\013sr.grpc." +
      "genB\013DangerAlertP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_alert_StateCodes_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_alert_StateCodes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_alert_StateCodes_descriptor,
        new java.lang.String[] { "StateCodes", });
    internal_static_alert_StateAlertFilter_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_alert_StateAlertFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_alert_StateAlertFilter_descriptor,
        new java.lang.String[] { "StateCode", "DangerTypes", });
    internal_static_alert_SubscriptionParams_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_alert_SubscriptionParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_alert_SubscriptionParams_descriptor,
        new java.lang.String[] { "AlertFilters", });
    internal_static_alert_Alert_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_alert_Alert_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_alert_Alert_descriptor,
        new java.lang.String[] { "StateName", "StateCode", "DangerType", "AffectedCities", });
    internal_static_alert_Alert_CityLevel_descriptor =
      internal_static_alert_Alert_descriptor.getNestedTypes().get(0);
    internal_static_alert_Alert_CityLevel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_alert_Alert_CityLevel_descriptor,
        new java.lang.String[] { "CityName", "SeverityLevel", });
    internal_static_alert_Empty_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_alert_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_alert_Empty_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
