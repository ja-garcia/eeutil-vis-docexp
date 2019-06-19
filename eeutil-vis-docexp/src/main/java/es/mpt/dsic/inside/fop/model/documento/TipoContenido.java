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


public class TipoContenido {

  protected byte[] valorBinario;
  protected String nombreFormato;

  /**
   * Gets the value of the valorBinario property.
   * 
   * @return possible object is byte[]
   */
  public byte[] getValorBinario() {
    return valorBinario;
  }

  /**
   * Sets the value of the valorBinario property.
   * 
   * @param value allowed object is byte[]
   */
  public void setValorBinario(byte[] value) {
    this.valorBinario = ((byte[]) value);
  }

  /**
   * Gets the value of the nombreFormato property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getNombreFormato() {
    return nombreFormato;
  }

  /**
   * Sets the value of the nombreFormato property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setNombreFormato(String value) {
    this.nombreFormato = value;
  }

}
