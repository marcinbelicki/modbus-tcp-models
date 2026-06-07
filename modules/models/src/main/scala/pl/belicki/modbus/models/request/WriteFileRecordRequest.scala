package pl.belicki.modbus.models.request

import pl.belicki.modbus.models.request.WriteFileRecordRequest.SubRequest
import pl.belicki.modbus.models.{FunctionCode, PublicFunctionCode}

case class WriteFileRecordRequest(
    subRequests: List[SubRequest]
) extends ModbusRequest {
  override def getCode: FunctionCode = PublicFunctionCode.WriteFileRecord
}

object WriteFileRecordRequest {
  case class SubRequest(
      fileNumber: Int,
      recordNumber: Int,
      recordLength: Int,
      recordData: Array[Byte]
  )
}
