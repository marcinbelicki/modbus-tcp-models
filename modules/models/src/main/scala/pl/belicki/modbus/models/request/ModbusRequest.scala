package pl.belicki.modbus.models.request

import pl.belicki.modbus.models.FunctionCode

trait ModbusRequest {

  def getCode: FunctionCode

}
