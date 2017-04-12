package test.quick

import com.typesafe.config.ConfigFactory

object Main extends App {

  val log = org.slf4j.LoggerFactory.getLogger(this.getClass)
  val cfg = ConfigFactory.load()

  log.info(s"param=" + cfg.getString("test.quick.param"))
}
