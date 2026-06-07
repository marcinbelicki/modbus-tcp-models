package pl.belicki.modbus.models.function

object ReadCoils extends ModbusFunction(0x01) {
  case class Request(
      address: Int,
      quantity: Int
  ) extends super.Request

  override type REQ = Request

}
