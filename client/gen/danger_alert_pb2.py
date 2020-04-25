# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: danger-alert.proto

from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='danger-alert.proto',
  package='alert',
  syntax='proto3',
  serialized_options=b'\n\013sr.grpc.genB\013DangerAlertP\001',
  serialized_pb=b'\n\x12\x64\x61nger-alert.proto\x12\x05\x61lert\" \n\nStateCodes\x12\x12\n\nstateCodes\x18\x01 \x03(\t\"M\n\x10StateAlertFilter\x12\x11\n\tstateCode\x18\x01 \x01(\t\x12&\n\x0b\x64\x61ngerTypes\x18\x02 \x03(\x0e\x32\x11.alert.DangerType\"C\n\x12SubscriptionParams\x12-\n\x0c\x61lertFilters\x18\x01 \x03(\x0b\x32\x17.alert.StateAlertFilter\"\xd0\x01\n\x05\x41lert\x12\x11\n\tstateName\x18\x01 \x01(\t\x12\x11\n\tstateCode\x18\x02 \x01(\t\x12%\n\ndangerType\x18\x03 \x01(\x0e\x32\x11.alert.DangerType\x12.\n\x0e\x61\x66\x66\x65\x63tedCities\x18\x04 \x03(\x0b\x32\x16.alert.Alert.CityLevel\x1aJ\n\tCityLevel\x12\x10\n\x08\x63ityName\x18\x01 \x01(\t\x12+\n\rseverityLevel\x18\x02 \x01(\x0e\x32\x14.alert.SeverityLevel\"\x07\n\x05\x45mpty*D\n\nDangerType\x12\r\n\tHURRICANE\x10\x00\x12\t\n\x05\x46LOOD\x10\x01\x12\x0e\n\nEARTHQUAKE\x10\x02\x12\x0c\n\x08\x42LIZZARD\x10\x03*.\n\rSeverityLevel\x12\x07\n\x03LOW\x10\x00\x12\n\n\x06MEDIUM\x10\x01\x12\x08\n\x04HIGH\x10\x02\x32w\n\x0c\x41lertService\x12-\n\x08GetCodes\x12\x0c.alert.Empty\x1a\x11.alert.StateCodes\"\x00\x12\x38\n\tGetAlerts\x12\x19.alert.SubscriptionParams\x1a\x0c.alert.Alert\"\x00\x30\x01\x42\x1c\n\x0bsr.grpc.genB\x0b\x44\x61ngerAlertP\x01\x62\x06proto3'
)

_DANGERTYPE = _descriptor.EnumDescriptor(
  name='DangerType',
  full_name='alert.DangerType',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='HURRICANE', index=0, number=0,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='FLOOD', index=1, number=1,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='EARTHQUAKE', index=2, number=2,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='BLIZZARD', index=3, number=3,
      serialized_options=None,
      type=None),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=431,
  serialized_end=499,
)
_sym_db.RegisterEnumDescriptor(_DANGERTYPE)

DangerType = enum_type_wrapper.EnumTypeWrapper(_DANGERTYPE)
_SEVERITYLEVEL = _descriptor.EnumDescriptor(
  name='SeverityLevel',
  full_name='alert.SeverityLevel',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='LOW', index=0, number=0,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='MEDIUM', index=1, number=1,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='HIGH', index=2, number=2,
      serialized_options=None,
      type=None),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=501,
  serialized_end=547,
)
_sym_db.RegisterEnumDescriptor(_SEVERITYLEVEL)

SeverityLevel = enum_type_wrapper.EnumTypeWrapper(_SEVERITYLEVEL)
HURRICANE = 0
FLOOD = 1
EARTHQUAKE = 2
BLIZZARD = 3
LOW = 0
MEDIUM = 1
HIGH = 2



_STATECODES = _descriptor.Descriptor(
  name='StateCodes',
  full_name='alert.StateCodes',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='stateCodes', full_name='alert.StateCodes.stateCodes', index=0,
      number=1, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=29,
  serialized_end=61,
)


_STATEALERTFILTER = _descriptor.Descriptor(
  name='StateAlertFilter',
  full_name='alert.StateAlertFilter',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='stateCode', full_name='alert.StateAlertFilter.stateCode', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='dangerTypes', full_name='alert.StateAlertFilter.dangerTypes', index=1,
      number=2, type=14, cpp_type=8, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=63,
  serialized_end=140,
)


_SUBSCRIPTIONPARAMS = _descriptor.Descriptor(
  name='SubscriptionParams',
  full_name='alert.SubscriptionParams',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='alertFilters', full_name='alert.SubscriptionParams.alertFilters', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=142,
  serialized_end=209,
)


_ALERT_CITYLEVEL = _descriptor.Descriptor(
  name='CityLevel',
  full_name='alert.Alert.CityLevel',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='cityName', full_name='alert.Alert.CityLevel.cityName', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='severityLevel', full_name='alert.Alert.CityLevel.severityLevel', index=1,
      number=2, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=346,
  serialized_end=420,
)

_ALERT = _descriptor.Descriptor(
  name='Alert',
  full_name='alert.Alert',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='stateName', full_name='alert.Alert.stateName', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='stateCode', full_name='alert.Alert.stateCode', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='dangerType', full_name='alert.Alert.dangerType', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='affectedCities', full_name='alert.Alert.affectedCities', index=3,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[_ALERT_CITYLEVEL, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=212,
  serialized_end=420,
)


_EMPTY = _descriptor.Descriptor(
  name='Empty',
  full_name='alert.Empty',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=422,
  serialized_end=429,
)

_STATEALERTFILTER.fields_by_name['dangerTypes'].enum_type = _DANGERTYPE
_SUBSCRIPTIONPARAMS.fields_by_name['alertFilters'].message_type = _STATEALERTFILTER
_ALERT_CITYLEVEL.fields_by_name['severityLevel'].enum_type = _SEVERITYLEVEL
_ALERT_CITYLEVEL.containing_type = _ALERT
_ALERT.fields_by_name['dangerType'].enum_type = _DANGERTYPE
_ALERT.fields_by_name['affectedCities'].message_type = _ALERT_CITYLEVEL
DESCRIPTOR.message_types_by_name['StateCodes'] = _STATECODES
DESCRIPTOR.message_types_by_name['StateAlertFilter'] = _STATEALERTFILTER
DESCRIPTOR.message_types_by_name['SubscriptionParams'] = _SUBSCRIPTIONPARAMS
DESCRIPTOR.message_types_by_name['Alert'] = _ALERT
DESCRIPTOR.message_types_by_name['Empty'] = _EMPTY
DESCRIPTOR.enum_types_by_name['DangerType'] = _DANGERTYPE
DESCRIPTOR.enum_types_by_name['SeverityLevel'] = _SEVERITYLEVEL
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

StateCodes = _reflection.GeneratedProtocolMessageType('StateCodes', (_message.Message,), {
  'DESCRIPTOR' : _STATECODES,
  '__module__' : 'danger_alert_pb2'
  # @@protoc_insertion_point(class_scope:alert.StateCodes)
  })
_sym_db.RegisterMessage(StateCodes)

StateAlertFilter = _reflection.GeneratedProtocolMessageType('StateAlertFilter', (_message.Message,), {
  'DESCRIPTOR' : _STATEALERTFILTER,
  '__module__' : 'danger_alert_pb2'
  # @@protoc_insertion_point(class_scope:alert.StateAlertFilter)
  })
_sym_db.RegisterMessage(StateAlertFilter)

SubscriptionParams = _reflection.GeneratedProtocolMessageType('SubscriptionParams', (_message.Message,), {
  'DESCRIPTOR' : _SUBSCRIPTIONPARAMS,
  '__module__' : 'danger_alert_pb2'
  # @@protoc_insertion_point(class_scope:alert.SubscriptionParams)
  })
_sym_db.RegisterMessage(SubscriptionParams)

Alert = _reflection.GeneratedProtocolMessageType('Alert', (_message.Message,), {

  'CityLevel' : _reflection.GeneratedProtocolMessageType('CityLevel', (_message.Message,), {
    'DESCRIPTOR' : _ALERT_CITYLEVEL,
    '__module__' : 'danger_alert_pb2'
    # @@protoc_insertion_point(class_scope:alert.Alert.CityLevel)
    })
  ,
  'DESCRIPTOR' : _ALERT,
  '__module__' : 'danger_alert_pb2'
  # @@protoc_insertion_point(class_scope:alert.Alert)
  })
_sym_db.RegisterMessage(Alert)
_sym_db.RegisterMessage(Alert.CityLevel)

Empty = _reflection.GeneratedProtocolMessageType('Empty', (_message.Message,), {
  'DESCRIPTOR' : _EMPTY,
  '__module__' : 'danger_alert_pb2'
  # @@protoc_insertion_point(class_scope:alert.Empty)
  })
_sym_db.RegisterMessage(Empty)


DESCRIPTOR._options = None

_ALERTSERVICE = _descriptor.ServiceDescriptor(
  name='AlertService',
  full_name='alert.AlertService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  serialized_start=549,
  serialized_end=668,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetCodes',
    full_name='alert.AlertService.GetCodes',
    index=0,
    containing_service=None,
    input_type=_EMPTY,
    output_type=_STATECODES,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='GetAlerts',
    full_name='alert.AlertService.GetAlerts',
    index=1,
    containing_service=None,
    input_type=_SUBSCRIPTIONPARAMS,
    output_type=_ALERT,
    serialized_options=None,
  ),
])
_sym_db.RegisterServiceDescriptor(_ALERTSERVICE)

DESCRIPTOR.services_by_name['AlertService'] = _ALERTSERVICE

# @@protoc_insertion_point(module_scope)
