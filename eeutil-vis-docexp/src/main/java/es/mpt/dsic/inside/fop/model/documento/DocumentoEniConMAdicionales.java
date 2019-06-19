/*
 * Copyright (C) 2012-13 MINHAP, Gobierno de España This program is licensed and may be used,
 * modified and redistributed under the terms of the European Public License (EUPL), either version
 * 1.1 or (at your option) any later version as soon as they are approved by the European
 * Commission. Unless required by applicable law or agreed to in writing, software distributed under
 * the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions and
 * more details. You should have received a copy of the EUPL1.1 license along with this program; if
 * not, you may find it at http://joinup.ec.europa.eu/software/page/eupl/licence-eupl
 */


package es.mpt.dsic.inside.fop.model.documento;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DocumentoEniConMAdicionales {

  protected TipoDocumento documento;
  protected List<MetadatoAdicional> metadatoAdicional;

  /**
   * Gets the value of the documento property.
   * 
   * @return possible object is {@link TipoDocumento }
   * 
   */
  public TipoDocumento getDocumento() {
    return documento;
  }

  /**
   * Sets the value of the documento property.
   * 
   * @param value allowed object is {@link TipoDocumento }
   * 
   */
  public void setDocumento(TipoDocumento value) {
    this.documento = value;
  }

  public List<MetadatoAdicional> getMetadatoAdicional() {
    return metadatoAdicional;
  }

  public void setMetadatoAdicional(List<MetadatoAdicional> metadatoAdicional) {
    this.metadatoAdicional = metadatoAdicional;
  }

}
