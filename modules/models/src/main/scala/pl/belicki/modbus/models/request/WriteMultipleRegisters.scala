package pl.belicki.modbus.models.request

import pl.belicki.modbus.models.{FunctionCode, PublicFunctionCode}

case class WriteMultipleRegisters(
    address: Int,
    quantity: Int,
    value: Array[Byte]
) extends ModbusRequest {
  override def getCode: FunctionCode = PublicFunctionCode.WriteMultipleRegisters
}
