package pl.belicki.modbus.models.request

import pl.belicki.modbus.models.{FunctionCode, PublicFunctionCode}

case class ReadInputRegistersRequest(
    address: Int,
    quantity: Int
) extends ModbusRequest {
  override def getCode: FunctionCode = PublicFunctionCode.ReadInputRegisters
}
