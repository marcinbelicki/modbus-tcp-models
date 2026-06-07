package pl.belicki.modbus.models.request

import pl.belicki.modbus.models.{FunctionCode, PublicFunctionCode}

case class ReadWriteMultipleRegisters(
    readAddress: Int,
    readQuantity: Int,
    writeAddress: Int,
    writeValue: Array[Byte]
) extends ModbusRequest {
  override def getCode: FunctionCode = PublicFunctionCode.ReadWriteMultipleRegisters
}
