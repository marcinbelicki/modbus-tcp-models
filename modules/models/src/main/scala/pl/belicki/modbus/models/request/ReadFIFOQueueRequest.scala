package pl.belicki.modbus.models.request

import pl.belicki.modbus.models.{FunctionCode, PublicFunctionCode}

case class ReadFIFOQueueRequest(
    address: Int
) extends ModbusRequest {
  override def getCode: FunctionCode = PublicFunctionCode.ReadFIFOQueue
}
