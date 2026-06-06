package pl.belicki.modbus.models.request

import pl.belicki.modbus.models.{FunctionCode, PublicFunctionCode}

case class ReadCoilsRequest(
    address: Int,
    quantity: Int
) extends ModbusRequest {
  override def getCode: FunctionCode = PublicFunctionCode.ReadCoils
}
