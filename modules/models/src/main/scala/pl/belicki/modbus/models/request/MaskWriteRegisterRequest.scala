package pl.belicki.modbus.models.request

import pl.belicki.modbus.models.{FunctionCode, PublicFunctionCode}

case class MaskWriteRegisterRequest(
    address: Int,
    andMask: Short,
    orMask: Short
) extends ModbusRequest {
  override def getCode: FunctionCode = PublicFunctionCode.MaskWriteRegister
}
